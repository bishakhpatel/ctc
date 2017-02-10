<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/responsive/common/footer"  %>

<c:if test="${component.visible}">
	<%-- <div class="container-fluid">
	    <div class="footer__top">
	        <div class="row">
	            <div class="footer__left col-xs-12 col-sm-12 col-md-9">
	                <div class="row">
	                	<c:forEach items="${component.navigationNode.children}" var="childLevel1">
		                	<c:forEach items="${childLevel1.children}" step="${component.wrapAfter}" varStatus="i">
							   <div class="footer__nav--container col-xs-12 col-sm-3">
		                	       <c:if test="${component.wrapAfter > i.index}">
	                                   <div class="title">${childLevel1.title}</div>
	                               </c:if>
	                               <ul class="footer__nav--links">
	                                   <c:forEach items="${childLevel1.children}" var="childLevel2" begin="${i.index}" end="${i.index + component.wrapAfter - 1}">
	                                        <c:forEach items="${childLevel2.entries}" var="childlink" >
		                                        <cms:component component="${childlink.item}" evaluateRestriction="true" element="li" class="footer__link"/>
	                                        </c:forEach>
	                                   </c:forEach>
	                               </ul>
	                		   </div>
						    </c:forEach>
	                	</c:forEach>
	               </div>
	           </div>
	           <div class="footer__right col-xs-12 col-md-3">
	               <c:if test="${showLanguageCurrency}">
	                   <div class="row">
	                       <div class="col-xs-6 col-md-6 footer__dropdown">
	                           <footer:languageSelector languages="${languages}" currentLanguage="${currentLanguage}" />
	                       </div>
	                       <div class="col-xs-6 col-md-6 footer__dropdown">
	                           <footer:currencySelector currencies="${currencies}" currentCurrency="${currentCurrency}" />
	                       </div>
	                   </div>
	               </c:if>
	            </div>
	        </div>
	    </div>
	</div> --%>
	
	<footer class="footer">
            <a href="#page-content" class="button footer__button_top" role="button">Top</a>
            <div class="footer__wrapper">
                <nav class="menu footer-main-menu col-md-7">
                    <ul class="nav menu">
<li class="item-10836 default current active"><a href="en/index.html">Home</a></li><li class="item-10838"><a href="en/faq.html">FAQ</a></li><li class="item-10840"><a href="en/contact-us.html">Contact us</a></li><li class="item-10842"><a href="en/site-map-en.html">Site map</a></li><li class="item-10863"><a href="en/privacy-policy.html">Privacy Policy</a></li><li class="item-10864"><a href="en/terms-conditions.html">Terms &amp; conditions</a></li></ul>

                </nav>
                <nav class="menu menu_social col-md-5">
                                        <span class="menu_social__header">Connect With CTC Canada</span>
                                        <ul class="nav menu">
                                        
<li class="item-10854"><a href="https://www.facebook.com/" target="_blank"><img src="${themeResourcePath}/images/facebook.png" alt="Facebook Page"></a></li>
<li class="item-10867"><a href="https://twitter.com/Woods_Canada" target="_blank"><img src="${themeResourcePath}/images/Twitter_icon.png" alt="Twitter Page"></a></li>
<li class="item-10856"><a href="https://instagram.com/woodscanada"><img src="${themeResourcePath}/images/instagram.png" alt="Instagram Page"></a></li></ul>

                </nav>
            </div>
        </footer>
	
	
	
	
	
	<%-- <div class="footer__bottom">
	    <div class="footer__copyright">
	        <div class="container">${notice}</div>
	    </div>
	</div> --%>
</c:if>