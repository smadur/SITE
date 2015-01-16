package org.sitenv.portlets.ccdavalidator.views;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;


@Component("referenceCCDATreeJsonView")
public class ReferenceCCDATreeJsonView extends AbstractView {
	
	private Logger logger = Logger.getLogger(ReferenceCCDATreeJsonView.class);
	
	public ReferenceCCDATreeJsonView() {
		super();
		
		setContentType("text/plain");
	}
	
	@Override
    protected void renderMergedOutputModel(Map map, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    logger.info("Resolving ajax request view - " + map);
    
    logger.info(map.toString());
    
    logger.info("content Type = " + getContentType());
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(map.get("jsonRoot").toString());
    
    System.out.println("000000000000000000000");
    System.out.println(map.get("jsonRoot").toString());
    System.out.println(request.toString());
    System.out.println("000000000000000000000");
    
    
    response.getWriter().flush();
    }

}