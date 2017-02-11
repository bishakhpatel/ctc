<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<c:set var="hasSubChild" value="true"/>
<div class="header__wrapper">
                <div class="logo">
                	<cms:pageSlot position="SiteLogo" var="logo" limit="1">
						<cms:component component="${logo}" element="div" class="yComponentWrapper"/>
					</cms:pageSlot>
                </div>
                <div class="mobile-site-logo hidden-md hidden-lg">
                	<a href="/"><img src="${themeResourcePath}/images/mobile-ctc-logo.png"></a>
                </div>
                <div class="header__content">
                <div class="site-caption hidden-xs hidden-sm">Canadian Tire Corporation</div>
                    <nav class="menu menu_main">
                        <input type="checkbox" id="main-menu-checkbox">
                        
                        <label for="main-menu-checkbox" onclick=""></label>
                        <ul class="nav menu" id="products-menu-trigger">
                        <c:forEach items="${component.navigationNode.children}" var="childLevel1">
                        	<li class="item" id="first-menu">
                        		<c:forEach items="${childLevel1.entries}" var="childlink1">
									<cms:component component="${childlink1.item}" evaluateRestriction="true" element="" class="menu__item menu_main__item" />
								</c:forEach>
                        	</li>
                        </c:forEach>
<!-- <li class="item" id="first-menu"><a href="en/products.html" class="menu__item menu_main__item">Products</a></li> -->
<li class="item"><a href="en/inspiration.html" class="menu__item menu_main__item">Inspiration</a></li>
<li class="item"><a href="en/woods-legacy.html" class="menu__item menu_main__item">Wood Legacy</a></li>
<li class="item"><a href="en/where-to-buy.html" class="menu__item menu_main__item">Where to buy</a></li>
</ul>
<div class="menu__holder" id="products-menu" style="display:none">
	<nav class="menu menu__products">
	    <!-- <header class="menu__products__header" data-products-menu-title="">Products</header> -->
	    	<ul class="menu__products__items">
<c:forEach items="${component.navigationNode.children}" var="childLevel1">
<li class="menu__products__item"><div class="primary-header">${childLevel1.title }</div></li>
<c:if test="${not empty childLevel1.children}">
	<c:choose>
		<c:when test="${hasSubChild}">
			<c:forEach items="${childLevel1.children}" var="childLevel2">
				<c:choose>
					<c:when test="${not empty childLevel2.children}">
					
					<li class="menu__products__item">
						<a href="javascript:void(0)">${childLevel2.title}</a>
						<div class="side-arrow">></div>
						<c:if test="${not empty childLevel2.children }">
													<ul>
															<c:forEach items="${childLevel2.children}" var="childLevel3" begin="${i.index}" end="${i.index + component.wrapAfter - 1}">
																<c:forEach items="${childLevel3.entries}" var="childlink3" >
																	<cms:component component="${childlink3.item}" evaluateRestriction="true" element="li" class="" />
																</c:forEach>
															</c:forEach>
													</ul>
													</c:if>
													
						
						
					</li>
						
					</c:when>
					<c:otherwise>
						<c:forEach items="${childLevel2.entries}" var="childlevel2link" >
							<cms:component component="${childlevel2link.item}" evaluateRestriction="true" element="li" class="menu__products__item"/>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</c:when>
	</c:choose>
</c:if>
</c:forEach>
	</ul>
	</nav>
</div>
                    </nav>
                </div>
                
                                
                            <%-- <cms:pageSlot position="MiniCart" var="cart" element="div" class="miniCartSlot componentContainer mobile__nav__row--table "><!-- hidden-sm hidden-md hidden-lg -->
								<cms:component component="${cart}" element="div" class="mobile__nav__row--table-cell" />
							</cms:pageSlot>--%>
							<%-- <cms:pageSlot position="MiniCart" var="cart" element="div" class="componentContainer">
								<cms:component component="${cart}" element="div"/>
							</cms:pageSlot> --%>
								<cms:pageSlot position="MiniCart" var="cart" limit="2">
									<cms:component component="${cart}" element="div" class="ctc-mini-cart" />
								</cms:pageSlot>
                                <cms:pageSlot position="SearchBox" var="component">
									<cms:component component="${component}" element="div"/>
								</cms:pageSlot>
								
								<div class="advance-search hidden-xs hidden-sm"><a href="javascript:void(0)">Advance Search</a></div>

            </div>