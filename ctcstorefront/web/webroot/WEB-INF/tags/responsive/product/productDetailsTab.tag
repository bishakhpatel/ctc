<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true"
	type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<div class="tab-details">
	<ycommerce:testId code="productDetails_content_label">
	<c:set var="unformattedDescription" value="${product.summary }"/>
		<ul>
			<c:forTokens items="${unformattedDescription }" delims=":|:" var="description">
   				<li><c:out value="${description}"/></li>
			</c:forTokens>
		</ul>
	</ycommerce:testId>
</div>

