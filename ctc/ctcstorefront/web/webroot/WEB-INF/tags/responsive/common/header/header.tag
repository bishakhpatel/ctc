<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="hideHeaderLinks" required="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav"%>

<cms:pageSlot position="TopHeaderSlot" var="component" element="div" class="container">
	<cms:component component="${component}" />
</cms:pageSlot>

<header class="js-mainHeader">

<header class="header">
            <div class="header__wrapper">
                <div class="logo">
                	<!-- <a href="en.html"><img src="templates/woods/image/en-gb/logo.png" alt="logo"></a> -->
                	<cms:pageSlot position="SiteLogo" var="logo" limit="1">
						<cms:component component="${logo}" element="div" class="yComponentWrapper"/>
					</cms:pageSlot>
                </div>
                <div class="header__content">
                <div class="site-caption">Canadian Tier Corporation</div>
                    <nav class="menu menu_main">
                        <input type="checkbox" id="main-menu-checkbox">
                        
                        <label for="main-menu-checkbox" onclick=""></label>
                        <ul class="nav menu" id="products-menu-trigger">
<li class="item" id="first-menu"><a href="en/products.html" class="menu__item menu_main__item">Products</a></li>
<li class="item"><a href="en/inspiration.html" class="menu__item menu_main__item">Inspiration</a></li>
<li class="item"><a href="en/woods-legacy.html" class="menu__item menu_main__item">Wood Legacy</a></li>
<li class="item"><a href="en/where-to-buy.html" class="menu__item menu_main__item">Where to buy</a></li>
</ul>
<div class="menu__holder" id="products-menu" style="display:none">   
  <nav class="menu menu__products">
    <header class="menu__products__header" data-products-menu-title="">Products</header>
    <ul class="menu__products__items">
                      <li class="menu__products__item">
          <a href="en/products/category/tents-accessories.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/tents.png" alt="Tents &amp; Accessories">
            </div>
            Tents &amp; Accessories          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/water-coolers.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/sunscreen.png" alt="Water Bottles &amp; Coolers">
            </div>
            Water Bottles &amp; Coolers          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/sleeping-bags.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/sleeping-bag.png" alt="Sleeping Bags">
            </div>
            Sleeping Bags          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/air-beds-cots-pads-mats.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/air-beds.png" alt="Air Beds, Cots &amp; Pads/Mats">
            </div>
            Air Beds, Cots &amp; Pads/Mats          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/stoves-cooking-accessories.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/stoves.png" alt="Stoves &amp; Cooking Accessories">
            </div>
            Stoves &amp; Cooking Accessories          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/lighting-accessories.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/lighting.png" alt="Lighting &amp; Accessories">
            </div>
            Lighting &amp; Accessories          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/backpacks-daypacks.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/bakcpacks.png" alt="Backpacks &amp; Daypacks">
            </div>
            Backpacks &amp; Daypacks          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/camping-furniture.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/chair.png" alt="Camping Furniture">
            </div>
            Camping Furniture          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/apparel.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/apparel.png" alt="Footwear &amp; Apparel">
            </div>
            Footwear &amp; Apparel          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/shelters-canopies-screenhouses.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/shelters.png" alt="Shelters &amp; Canopies/Screenhouses">
            </div>
            Shelters &amp; Canopies/Screenhouses          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/knives-multi-tools-accessories.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/knife.png" alt="Multi-Tools &amp; Camping Accessories">
            </div>
            Multi-Tools &amp; Camping Accessories          </a>

                  </li>
                      <li class="menu__products__item">
          <a href="en/products/category/fishing-accessories.html">
            <div class="menu__products__item__holder">
                <img class="menu__products__item__image" src="images/categories/fishing.png" alt="Fishing &amp; Accessories">
            </div>
            Fishing &amp; Accessories          </a>

                  </li>
          </ul>
  </nav>
  <aside class="menu__banner" style="display:none" data-products-menu-banner=""></aside>
</div>

                    </nav>
                </div>
                <%-- <nav class="menu menu_second">
                    <ul>
                        <li class="menu__item menu_second__item"><div class="mod-languages">

	<ul class="lang-inline">
						<li class="" dir="ltr">
			<a href="fr/index.html">
							Français						</a>
			</li>
							</ul>

</div>
</li>
                        <li class="menu__item menu_second__item"><ul class="nav menu">
<li class="item-10844"><a href="en/contact-us.html">CONTACT US</a></li></ul>
</li>
                    </ul>
                </nav> --%>
                                <!-- <form id="predictive-search-form" action="http://woods.ca/en/products/searchresult" class="search" method="GET" autocomplete="off">
                    <input type="text" name="searchquery" class="search__input"><input type="submit" value="Search" class="search__button search__button_inactive" disabled="">
                    <div class="search__autocomplete" id="predictive-search-results">
                        <ul class="no-list search__autocomplete__items"></ul>
                    </div>
                                    </form> -->
                                    <cms:pageSlot position="SearchBox" var="component">
									<cms:component component="${component}" element="div"/>
								</cms:pageSlot>

            </div>
        </header>







	<%-- <nav class="navigation navigation--top hidden-xs hidden-sm">
		<div class="row">
			<div class="col-sm-12 col-md-4">
				<div class="nav__left js-site-logo">
					<cms:pageSlot position="SiteLogo" var="logo" limit="1">
						<cms:component component="${logo}" element="div" class="yComponentWrapper"/>
					</cms:pageSlot>
				</div>
			</div>
			<div class="col-sm-12 col-md-8">
				<div class="nav__right">
					<ul class="nav__links nav__links--account">
						<c:if test="${empty hideHeaderLinks}">
							<c:if test="${uiExperienceOverride}">
								<li class="backToMobileLink"><c:url
										value="/_s/ui-experience?level=" var="backToMobileStoreUrl" />
									<a href="${backToMobileStoreUrl}"> <spring:theme
											code="text.backToMobileStore" />
									</a>
								</li>
							</c:if>

							<sec:authorize access="!hasAnyRole('ROLE_ANONYMOUS')">
								<c:set var="maxNumberChars" value="25" />
								<c:if test="${fn:length(user.firstName) gt maxNumberChars}">
									<c:set target="${user}" property="firstName"
										value="${fn:substring(user.firstName, 0, maxNumberChars)}..." />
								</c:if>

								<li class="logged_in js-logged_in">
									<ycommerce:testId code="header_LoggedUser">
										<spring:theme code="header.welcome" arguments="${user.firstName},${user.lastName}" htmlEscape="true" />
									</ycommerce:testId>
								</li>
							</sec:authorize>

							 <cms:pageSlot position="HeaderLinks" var="link">
								 <cms:component component="${link}" element="li" />
							 </cms:pageSlot>

							<sec:authorize access="hasAnyRole('ROLE_ANONYMOUS')" >
								<li class="liOffcanvas">
									<ycommerce:testId code="header_Login_link">
										<a href="<c:url value='/login'/>">
											<spring:theme code="header.link.login" />
										</a>
									</ycommerce:testId>
								</li>
							</sec:authorize>

							<sec:authorize access="!hasAnyRole('ROLE_ANONYMOUS')" >
								<li class="liOffcanvas">
									<ycommerce:testId code="header_signOut">
										<a href="<c:url value='/logout'/>">
											<spring:theme code="header.link.logout" />
										</a>
									</ycommerce:testId>
								</li>
							</sec:authorize>

						</c:if>
					</ul>
				</div>
			</div>
		</div>
	</nav> --%>
	<%-- a hook for the my account links in desktop/wide desktop--%>
	<!-- <div class="hidden-xs hidden-sm js-secondaryNavAccount collapse" id="accNavComponentDesktopOne">
		<ul class="nav__links">

		</ul>
	</div>
	<div class="hidden-xs hidden-sm js-secondaryNavCompany collapse" id="accNavComponentDesktopTwo">
		<ul class="nav__links js-nav__links">

		</ul>
	</div> -->
	<%-- <nav class="navigation navigation--middle js-navigation--middle">
		<div class="container-fluid">
			<div class="row">
				<div class="mobile__nav__row mobile__nav__row--table">
					<div class="mobile__nav__row--table-group">
						<div class="mobile__nav__row--table-row">
							<div class="mobile__nav__row--table-cell visible-xs hidden-sm">
								<button class="mobile__nav__row--btn btn mobile__nav__row--btn-menu js-toggle-sm-navigation"
										type="button">
									<span class="glyphicon glyphicon-align-justify"></span>
								</button>
							</div>

							<div class="mobile__nav__row--table-cell visible-xs mobile__nav__row--seperator">
								<ycommerce:testId code="header_search_activation_button">
									<button	class="mobile__nav__row--btn btn mobile__nav__row--btn-search js-toggle-xs-search hidden-sm hidden-md hidden-lg" type="button">
										<span class="glyphicon glyphicon-search"></span>
									</button>
								</ycommerce:testId>
							</div>

							<c:if test="${empty hideHeaderLinks}">
								<ycommerce:testId code="header_StoreFinder_link">
									<div class="mobile__nav__row--table-cell hidden-sm hidden-md hidden-lg mobile__nav__row--seperator">
										<a href="<c:url value="/store-finder"/>" class="mobile__nav__row--btn mobile__nav__row--btn-location btn">
											<span class="glyphicon glyphicon-map-marker"></span>
										</a>
									</div>
								</ycommerce:testId>
							</c:if>

							<cms:pageSlot position="MiniCart" var="cart" element="div" class="miniCartSlot componentContainer mobile__nav__row--table hidden-sm hidden-md hidden-lg">
								<cms:component component="${cart}" element="div" class="mobile__nav__row--table-cell" />
							</cms:pageSlot>

						</div>
					</div>
				</div>
			</div>
			<div class="row desktop__nav">
				<div class="nav__left col-xs-12 col-sm-6">
					<div class="row">
						<div class="col-sm-2 hidden-xs visible-sm mobile-menu">
							<button class="btn js-toggle-sm-navigation" type="button">
								<span class="glyphicon glyphicon-align-justify"></span>
							</button>
						</div>
						<div class="col-sm-10">
							<div class="site-search">
								<cms:pageSlot position="SearchBox" var="component">
									<cms:component component="${component}" element="div"/>
								</cms:pageSlot>
							</div>
						</div>
					</div>
				</div>
				<div class="nav__right col-xs-6 col-xs-6 hidden-xs">
					<ul class="nav__links nav__links--shop_info">
						<li>
							<c:if test="${empty hideHeaderLinks}">
								<ycommerce:testId code="header_StoreFinder_link">
									<div class="nav-location hidden-xs">
										<a href="<c:url value="/store-finder"/>" class="btn">
											<span class="glyphicon glyphicon-map-marker"></span>
										</a>
									</div>
								</ycommerce:testId>
							</c:if>

						</li>

						<li>
							<cms:pageSlot position="MiniCart" var="cart" element="div" class="componentContainer">

								<cms:component component="${cart}" element="div"/>

							</cms:pageSlot>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</nav> --%>
	<!-- <a id="skiptonavigation"></a> -->
	<%-- <nav:topNavigation /> --%>
</header>


<cms:pageSlot position="BottomHeaderSlot" var="component" element="div"	class="container-fluid">
	<cms:component component="${component}" />
</cms:pageSlot>
