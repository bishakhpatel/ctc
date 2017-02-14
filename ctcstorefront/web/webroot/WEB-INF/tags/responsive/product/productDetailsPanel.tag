<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>


<div class="product-details page-title visible-xs">
	<ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
		<div class="name">${product.name}</div>
	</ycommerce:testId>
	<product:productReviewSummary product="${product}" showLinks="true"/>

</div>
<div class="row">
	<div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
		<product:productImagePanel galleryImages="${galleryImages}"
			product="${product}" />
	</div>
	<div class="clearfix hidden-sm hidden-md hidden-lg"></div>
	<div class="col-sm-6 col-lg-8">
		<div class="product-main-info">
			<div class="row">
				<div class="product-details col-lg-12 page-title hidden-xs">
					<ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
						<div class="name">${product.name}</div>
					</ycommerce:testId>
					<product:productReviewSummary product="${product}" showLinks="true"/>
				
				</div>
			</div>
			<div class="row">
				<div class="col-lg-6 price-det">
					<div class="product-details">
						<%-- <product:productPromotionSection product="${product}"/> --%>

						<ycommerce:testId
								code="productDetails_productNamePrice_label_${product.code}">
							<product:productPricePanel product="${product}" />
						</ycommerce:testId>

					</div>
				</div>

				<div class="col-sm-12 col-md-9 col-lg-6">

							<cms:pageSlot position="VariantSelector" var="component" element="div" class="page-details-variants-select">
								<cms:component component="${component}" element="div" class="yComponentWrapper page-details-variants-select-component"/>
							</cms:pageSlot>



							<cms:pageSlot position="AddToCart" var="component" element="div" class="page-details-variants-select">
								<cms:component component="${component}" element="div" class="yComponentWrapper page-details-add-to-cart-component"/>
							</cms:pageSlot>

				</div>
			</div>
		</div>

	</div>
</div>