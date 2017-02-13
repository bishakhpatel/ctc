<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/responsive/common/footer"  %>

<c:if test="${component.visible}">
	<div class="container-fluid">
	    <div class="footer__top footer">
	        <div class="row">
	            <div class="footer__left col-md-4 col-xs-12 col-md-offset-2">
	                <div class="row">
	                	<c:forEach items="${component.navigationNode.children}" var="childLevel1">
		                	<c:forEach items="${childLevel1.children}" step="${component.wrapAfter}" varStatus="i">
							   <div class="footer__nav--container col-xs-12">
		                	       <c:if test="${component.wrapAfter > i.index}">
	                                   <div class="title">${childLevel1.title}</div>
	                               </c:if>
	                               <ul class="footer__nav--links">
	                                   <c:forEach items="${childLevel1.children}" var="childLevel2" begin="${i.index}" end="${i.index + component.wrapAfter - 1}">
	                                        <c:forEach items="${childLevel2.entries}" var="childlink" >
		                                        <cms:component component="${childlink.item}" evaluateRestriction="true" element="li" class="footer__link ${childlink.name }"/>
		                                       </c:forEach>
	                                   </c:forEach>
	                               </ul>
	                		   </div>
						    </c:forEach>
	                	</c:forEach>
	               </div>
	           </div>
	           <div class="footer__right col-xs-12 col-md-5">
	               <nav class="menu menu_social col-md-10">
                                        <span class="menu_social__header hidden-xs hidden-sm">Connect With CTC Canada</span>
                                        <ul class="nav menu">
                                        
<li class="item-10854"><a href="https://www.facebook.com/" target="_blank"><img src="${themeResourcePath}/images/facebook.png" alt="Facebook Page"></a></li>
<li class="item-10867"><a href="https://twitter.com/Woods_Canada" target="_blank"><img src="${themeResourcePath}/images/Twitter_icon.png" alt="Twitter Page"></a></li>
<li class="item-10856"><a href="https://instagram.com/woodscanada"><img src="${themeResourcePath}/images/instagram.png" alt="Instagram Page"></a></li></ul>

                </nav>
	            </div>
	        </div>
	    </div>
	</div>
</c:if>