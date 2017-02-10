/**
 *
 */
package com.ctc.core.dataimport.impl;

import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;
import de.hybris.platform.commerceservices.util.ResponsiveUtils;


/**
 * @author 515929
 *
 */
public class CTCSampleDataImportService extends SampleDataImportService
{

	@Override
	protected void importContentCatalog(final String extensionName, final String contentCatalogName)
	{
		super.importContentCatalog(extensionName, contentCatalogName);
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/contentCatalogs/%sContentCatalog/ctc-content.impex", extensionName,
						contentCatalogName), false);
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/contentCatalogs/%sContentCatalog/ctc-content_en.impex", extensionName,
						contentCatalogName), false);
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/contentCatalogs/%sContentCatalog/ctc-mobile-content.impex", extensionName,
						contentCatalogName), false);

		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/contentCatalogs/%sContentCatalog/ctc-mobile-content_en.impex", extensionName,
						contentCatalogName), false);

		if (ResponsiveUtils.isResponsive())
		{
			getSetupImpexService().importImpexFile(
					String.format("/%s/import/sampledata/contentCatalogs/%sContentCatalog/ctc-responsive-content.impex",
							extensionName, contentCatalogName), false);

			getSetupImpexService().importImpexFile(
					String.format("/%s/import/sampledata/contentCatalogs/%sContentCatalog/ctc-responsive-content_en.impex",
							extensionName, contentCatalogName), false);
		}
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/contentCatalogs/%sContentCatalog/ctc-content-pages_en.impex", extensionName,
						contentCatalogName), false);
	}

	@Override
	protected void importProductCatalog(final String extensionName, final String productCatalogName)
	{
		super.importProductCatalog(extensionName, productCatalogName);
		// Load CTC Categories
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_categories.impex", extensionName,
						productCatalogName), false);
		// Load CTC EN Categories
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_categories_en.impex", extensionName,
						productCatalogName), false);
		// Load CTC Categories media
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_categories-media.impex", extensionName,
						productCatalogName), false);
		// Load CTC EN Products
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_products_en.impex", extensionName,
						productCatalogName), false);

		// Load CTC FR Products
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_products_fr.impex", extensionName,
						productCatalogName), false);
		// Load CTC Product Category relation
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_products-fixup.impex", extensionName,
						productCatalogName), false);

		// Load CTC Product price
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_products-prices.impex", extensionName,
						productCatalogName), false);
		// Load CTC Product stock
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_products-stocklevels.impex", extensionName,
						productCatalogName), false);

		// Load CTC Product stock en
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_products-stocklevels_en.impex",
						extensionName, productCatalogName), false);
		// Load CTC EN Product Variant
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_variant_en.impex", extensionName,
						productCatalogName), false);
		// Load CTC FR Product Variant
		getSetupImpexService().importImpexFile(
				String.format("/%s/import/sampledata/productCatalogs/%sProductCatalog/ctc_variant_fr.impex", extensionName,
						productCatalogName), false);
	}
}
