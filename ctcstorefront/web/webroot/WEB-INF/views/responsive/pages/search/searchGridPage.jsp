<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="storepickup" tagdir="/WEB-INF/tags/responsive/storepickup" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<template:page pageTitle="${pageTitle}">
	<div class="row">
		<div class="col-xs-12 col-md-9 big-header-plp">
			<h1><spring:theme code="search.page.searchText" arguments="${searchPageData.freeTextSearch}"/></h1>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-3">
			<cms:pageSlot position="ProductLeftRefinements" var="feature" element="div" class="search-grid-page-left-refinements-slot">
				<cms:component component="${feature}" element="div" class="search-grid-page-left-refinements-component"/>
			</cms:pageSlot>
		</div>
		<div class="col-sm-12 col-md-9">
			<cms:pageSlot position="SearchResultsGridSlot" var="feature" element="div" class="search-grid-page-result-grid-slot">
				<cms:component component="${feature}" element="div" class="search-grid-page-result-grid-component"/>
			</cms:pageSlot>
		</div>
	</div>

	<storepickup:pickupStorePopup />

</template:page>