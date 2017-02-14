package com.lemontree.veloctiy;

import org.apache.velocity.context.Context;
import org.apache.velocity.tools.Scope;
import org.apache.velocity.tools.ToolManager;
import org.apache.velocity.tools.view.ViewToolContext;
import org.springframework.web.servlet.view.velocity.VelocityLayoutView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by YLBG-YCY-1325 on 2017/2/13.
 * Spring3默认的 createVelocityContext 方法中采用的是 tools-1.x 的 ToolboxManager, ServletToolboxManager等类
 * 加载toolbox，但是 tools 2.x 中已经废弃了这些类，导致了无法加载tools 2.x。
 * 所以，这里采用tools 2.x中新的 ToolManager方式重写此方法加载toolbox2.x。
 *
 */
public class VelocityLayoutToolboxView extends VelocityLayoutView{
    @Override
    protected Context createVelocityContext(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ViewToolContext ctx = new ViewToolContext(this.getVelocityEngine(),request,response,this.getServletContext());
        if (this.getToolboxConfigLocation()!=null){
            ToolManager toolManager = new ToolManager();
            toolManager.setVelocityEngine(this.getVelocityEngine());
            toolManager.configure(this.getServletContext().getRealPath(this.getToolboxConfigLocation()));

            for (String scop: Scope.values()){
                ctx.addToolbox(toolManager.getToolboxFactory().createToolbox(scop));
            }
        }
        if (null!=model && !model.isEmpty()){
            ctx.putAll(model);
        }
        return ctx;
    }
}
