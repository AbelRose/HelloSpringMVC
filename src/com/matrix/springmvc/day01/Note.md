springMVC的搭建过程：
1、导入jar
2、在web.xml中配置springMVC的核心（前端）控制器DispatcherServlet
    作用：加载springMVC(dispatcher)的配置文件，在下方的配置方式下，DispatcherServlet自动加载配置文件，此时的配置文件有默认的位置和名称
	默认位置：WEB-INF下，默认名称<servlet-name>-servlet.xml，例如以下配置方式的文件名：springMVC-servlet.xml(dispatcher-servlet.xml)
	当加载了配置文件，springMVC就会根据扫描组件找到控制层
	关于web.xml的url映射的小知识：
    < url-pattern>/</url-pattern> 会匹配到/login这样的路径型url，不会匹配到模式为*.jsp这样的后缀型url
    < url-pattern>/*</url-pattern> 会匹配所有url：路径型的和后缀型的url(包括/login,*.jsp,*.js和*.html等)
    
    
  <servlet>
  	<servlet-name>springMVC(dispatcher)</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  </servlet>
  <servlet-mapping>
  	<servlet-name>springMVC(dispatcher)</servlet-name>
  	<url-pattern>/</url-pattern>
  </servlet-mapping>
  
  
 3、创建一个POJO，在此类上加上@Controller注解，springMVC就会将此类作为控制层加载，让其处理请求响应
 4、在控制层中，需要在方法上设置@RequestMapping(value="xxx")
 springMVC就是通过此注解将请求路径与控制层中的方法进行匹配，此时请求路径为localhost:8080/projectName/xxx
 5、处理请求的方法会返回一个字符串，即视图名称，最终会通过配置文件中配置的视图解析器实现页面跳转
 方式：prefix + 视图名称 + suffix ，此为最终跳转的页面路径