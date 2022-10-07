<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
      xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
      xmlns:fo="http://www.w3.org/1999/XSL/Format"
	  xmlns:resources="a.a.a.c.c.d.h.EPH">>
  <xsl:output method="xml" indent="yes"/>
  <xsl:param name="image" />
  <xsl:param name="ref_id" />
  <xsl:param name="creation_date" />
  <xsl:param name="creation_place" />
  <xsl:param name="transaction_date" />
  <xsl:param name="seller_name" />
  <xsl:param name="seller_street" />
  <xsl:param name="seller_house_number" />
  <xsl:param name="seller_apartment_number" />
  <xsl:param name="seller_zip" />
  <xsl:param name="seller_city" />
  <xsl:param name="seller_nip" />
  <xsl:param name="seller_account_number" />
  <xsl:param name="seller_phone_number" />
  <xsl:param name="buyer_name" />
  <xsl:param name="buyer_street" />
  <xsl:param name="buyer_house_number" />
  <xsl:param name="buyer_apartment_number" />
  <xsl:param name="buyer_zip" />
  <xsl:param name="buyer_city" />
  <xsl:param name="buyer_nip" />
  <xsl:param name="to_pay" />
  <xsl:param name="to_pay_words" />
  <xsl:param name="payment_type" />
  <xsl:param name="payment_date" />
  <xsl:param name="payment_date_name" />
  <xsl:param name="exempt_reason" />
  <xsl:param name="remarks" />
  <xsl:param name="summary" />
  <xsl:param name="sum_net" />
  <xsl:param name="sum_tax" />
  <xsl:param name="sum_brut" />
  <xsl:param name="is_cancelled" />
  <xsl:param name="unit_price" />
  

  <xsl:template match="invoiceSell">
    <fo:root>
      <fo:layout-master-set>
        <fo:simple-page-master master-name="A4-portrait"
              page-height="29.7cm" page-width="21.0cm" margin="2cm">
          <fo:region-body/>
          <fo:region-before/>
		  <fo:region-after />
        </fo:simple-page-master>
      </fo:layout-master-set>
      <fo:page-sequence master-reference="A4-portrait" id="page"
				font-size="8" font-family="jpkLocalFont">
		 			<fo:static-content flow-name="xsl-region-before">

		                <fo:block line-height="0">
		                <xsl:if test="$is_cancelled">
		                    <fo:instream-foreign-object>
		                        <svg:svg width="100%" height="100%" xmlns:svg="http://www.w3.org/2000/svg">

		                            <svg:g transform="rotate(45)">
		                                <svg:text x="173" y="100" style="font-family:Times New Roman;font-size:45;font-weight:normal;stroke-width:0.5;fill:red;stroke:lightgray;fill-opacity:0.5;">
		                                    FAKTURA ANULOWANA
		                                </svg:text>
		                                    <svg:rect x="133" y="40" width="585" height="90"
  									style="fill:white;stroke:red;stroke-width:4;fill-opacity:0;stroke-opacity:0.5" />
		                            </svg:g>

		                        </svg:svg>
		                    </fo:instream-foreign-object>
		                       </xsl:if>
		                </fo:block>

		          </fo:static-content>

			<fo:static-content flow-name="xsl-region-after">

				<fo:block padding-top="1cm">
					<fo:table width="100%">
						<fo:table-body>
							<fo:table-row>
								<fo:table-cell text-align="left">
									<fo:block>
										<xsl:value-of
											select="resources:getString('micro.process.invoices_records.print.printFrom')" />
									</fo:block>
								</fo:table-cell>
								<fo:table-cell text-align="right">
									<fo:block>
										<xsl:value-of
											select="resources:getString('micro.process.invoices_records.print.page')" />
										<xsl:value-of select="' '" />
										<fo:page-number font-weight="bold" />
										<xsl:value-of select="' '" />
										<xsl:value-of
											select="resources:getString('micro.process.invoices_records.print.of')" />
										<xsl:value-of select="' '" />
										<fo:page-number-citation-last
											font-weight="bold" ref-id="page" />
									</fo:block>
								</fo:table-cell>
							</fo:table-row>
						</fo:table-body>
					</fo:table>
				</fo:block>
			</fo:static-content>
        <fo:flow flow-name="xsl-region-body">

        <fo:block wrap-option="wrap">

				<fo:table>
					<fo:table-column column-width="60%" />
					<fo:table-column column-width="40%" />
					<fo:table-body>
						<fo:table-row>
							<fo:table-cell text-align="left">
								<fo:block>
									<fo:block font-size="14">
										<fo:inline font-weight="bold">
											<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.Invoice')"/>
										</fo:inline>
										<xsl:value-of select="' '" />
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.Nr')"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$ref_id" />
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.CreationDate')"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$creation_date"/>
										<xsl:value-of select="$creation_place" />
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.TransactionDate')"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$transaction_date"/>
									</fo:block>
									<fo:block>
										 <fo:leader />
									</fo:block>
								</fo:block>
							</fo:table-cell>
							<fo:table-cell text-align="left">
								<fo:block>
									<fo:external-graphic
										xmlns:fo="http://www.w3.org/1999/XSL/Format"
										content-width="200"
										content-height="140"
										scaling="uniform"
										src='data:image/png;base64,{$image}'/>
								</fo:block>
								<fo:block>
									 <fo:leader />
								</fo:block>
							</fo:table-cell>
						</fo:table-row>
						<fo:table-row>
						<fo:table-cell text-align="left">
								<fo:block>
									<fo:block wrap-option="wrap">
										<fo:inline font-weight="bold">
											<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.Seller')"/>
										</fo:inline>
									</fo:block>
									<fo:block>
										 <fo:leader />
									</fo:block>
									<fo:block>
										<xsl:value-of select="$seller_name"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="$seller_street"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$seller_house_number"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$seller_apartment_number"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="$seller_zip"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$seller_city"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.NIP')"/>
										<xsl:value-of select="': '" />
										<xsl:value-of select="$seller_nip"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="$seller_account_number"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="$seller_phone_number"/>
									</fo:block>
									<fo:block>
										 <fo:leader />
									</fo:block>
								</fo:block>
							</fo:table-cell>
							<fo:table-cell text-align="left">
								<fo:block wrap-option="wrap">
									<fo:block wrap-option="wrap">
										<fo:inline font-weight="bold">
											<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.Buyer')"/>
											</fo:inline>
									</fo:block>
									<fo:block>
										 <fo:leader />
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="$buyer_name"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="$buyer_street"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$buyer_house_number"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$buyer_apartment_number"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="$buyer_zip"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$buyer_city"/>
									</fo:block>
									<fo:block wrap-option="wrap">
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.NIP')"/>
										<xsl:value-of select="': '" />
										<xsl:value-of select="$buyer_nip"/>
									</fo:block>
									<fo:block>
										 <fo:leader />
									</fo:block>
								</fo:block>
							</fo:table-cell>
						</fo:table-row>
					</fo:table-body>
				</fo:table>
			</fo:block>
            <fo:block>
				<fo:leader />
            </fo:block>
		    <fo:table font-size="7" table-omit-footer-at-break="true">
		  		<fo:table-column width="3%" column-width="3%" />
				<fo:table-column width="33%" column-width="33%" />
				<fo:table-column width="8%" column-width="8%" />
				<fo:table-column width="10%" column-width="10%" />
				<fo:table-column width="8%" column-width="8%" />
				<fo:table-column width="8%" column-width="8%" />
				<fo:table-column width="10%" column-width="10%" />
				<fo:table-column width="10%" column-width="10%" />
				<fo:table-column width="10%" column-width="10%" />
				<fo:table-header font-weight="bold" border-top="solid black"
					border-left="solid black">
					<fo:table-row border-bottom="solid black"
						display-align="center" text-align="center">
						<fo:table-cell border-right="solid black">
							<fo:block margin-top="2mm" margin-bottom="2mm">
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.InvoiceElementNr')" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black">
							<fo:block margin-top="2mm" margin-bottom="2mm">
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.InvoiceElementName')" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.InvoiceElementUnit')" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block>
								<xsl:value-of
									select="$unit_price" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.InvoiceElementAmount')" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.InvoiceElementTaxType')" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.Netto')" />
							</fo:block>
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.PLN')" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.VAT')" />
							</fo:block>
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.PLN')" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block>
							<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.Brutto')" />
							</fo:block>
							<fo:block>
								<xsl:value-of
									select="resources:getString('micro.process.invoice_sale_new.Print.PLN')" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-header>
				<fo:table-body border-left="solid black">
					<xsl:apply-templates select="invoiceSellElements" />
				</fo:table-body>
			</fo:table>
			<fo:table font-size="7" table-omit-footer-at-break="true">
				<fo:table-column width="70%" column-width="70%" />
				<fo:table-column width="10%" column-width="10%" />
				<fo:table-column width="10%" column-width="10%" />
				<fo:table-column width="10%" column-width="10%" />
				<fo:table-header font-weight="bold" border-top="solid black"
					border-left="solid black">
					<fo:table-row border-bottom="solid black"
						display-align="center" text-align="right">
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm">
							<fo:block margin="0.5mm">
								<xsl:value-of
									select="$summary" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm" text-align="right">
							<fo:block margin="0.5mm">
								<xsl:value-of
									select="$sum_net" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm" text-align="right">
							<fo:block margin="0.5mm">
								<xsl:value-of
									select="$sum_tax" />
							</fo:block>
						</fo:table-cell>
						<fo:table-cell border-right="solid black"
							margin-top="2mm" margin-bottom="2mm" text-align="right">
							<fo:block margin="0.5mm">
								<xsl:value-of
									select="$sum_brut" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-header>
				<fo:table-body border-left="solid black">
					<fo:table-cell><fo:block /></fo:table-cell>
				</fo:table-body>
			</fo:table>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:table>
				<fo:table-column column-width="70%" />
				<fo:table-column column-width="30%" />
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left">
							<fo:block>
								<fo:table font-size="7" table-omit-footer-at-break="true">
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-header font-weight="bold" border-top="solid black"
										border-left="solid black">
										<fo:table-row border-bottom="solid black"
											display-align="center" text-align="center">
											<fo:table-cell border-right="solid black">
												<fo:block margin-top="2mm" margin-bottom="2mm">
													<xsl:value-of
														select="resources:getString('micro.process.invoice_sale_new.SummaryTaxType')" />
												</fo:block>
											</fo:table-cell>
											<fo:table-cell border-right="solid black"
												>
												<fo:block margin-top="2mm" margin-bottom="2mm">
													<xsl:value-of
														select="resources:getString('micro.process.invoice_sale_new.SummaryNetSum')" />
												</fo:block>
											</fo:table-cell>
											<fo:table-cell border-right="solid black"
												margin-top="2mm" margin-bottom="2mm">
												<fo:block>
													<xsl:value-of
														select="resources:getString('micro.process.invoice_sale_new.SummaryTaxSum')" />
												</fo:block>
											</fo:table-cell>
											<fo:table-cell border-right="solid black"
												margin-top="2mm" margin-bottom="2mm">
												<fo:block>
													<xsl:value-of
														select="resources:getString('micro.process.invoice_sale_new.SummaryBrutSum')" />
												</fo:block>
											</fo:table-cell>
										</fo:table-row>
									</fo:table-header>
									<fo:table-body border-left="solid black">
										<xsl:apply-templates select="summaryTable" />
									</fo:table-body>
								</fo:table>
							</fo:block>
							<fo:block>
								<fo:table font-size="7" table-omit-footer-at-break="true">
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-column width="20%" column-width="20%" />
									<fo:table-header font-weight="bold" border-top="solid black"
										border-left="solid black">
										<fo:table-row border-bottom="solid black"
											display-align="center" text-align="right">
											<fo:table-cell border-right="solid black"
												margin-top="2mm" margin-bottom="2mm">
												<fo:block margin="0.5mm">
													<xsl:value-of
														select="$summary" />
												</fo:block>
											</fo:table-cell>
											<fo:table-cell border-right="solid black"
												margin-top="2mm" margin-bottom="2mm" text-align="right">
												<fo:block margin="0.5mm">
													<xsl:value-of
														select="$sum_net" />
												</fo:block>
											</fo:table-cell>
											<fo:table-cell border-right="solid black"
												margin-top="2mm" margin-bottom="2mm" text-align="right">
												<fo:block margin="0.5mm">
													<xsl:value-of
														select="$sum_tax" />
												</fo:block>
											</fo:table-cell>
											<fo:table-cell border-right="solid black"
												margin-top="2mm" margin-bottom="2mm" text-align="right">
												<fo:block margin="0.5mm">
													<xsl:value-of
														select="$sum_brut" />
												</fo:block>
											</fo:table-cell>
										</fo:table-row>
									</fo:table-header>
									<fo:table-body border-left="solid black">
									<fo:table-cell><fo:block /></fo:table-cell>
									</fo:table-body>
								</fo:table>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="left">
							<fo:block>
								<fo:block>
									<fo:inline font-weight="bold" font-size="11">
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.ToPay')"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$to_pay" />
										<xsl:value-of select="' '" />
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.ToPayCurrency')"/>
									</fo:inline>
								</fo:block>
								<fo:block>
									<fo:inline font-style="italic">
										<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.ToPayWords')"/>
										<xsl:value-of select="' '" />
										<xsl:value-of select="$to_pay_words" />
									</fo:inline>
								</fo:block>
								<fo:block>
									<fo:leader />
								</fo:block>
								<fo:block>
									<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.PaymentType')"/>
									<xsl:value-of select="': '" />
									<xsl:value-of select="$payment_type" />
								</fo:block>
								<fo:block>
									<xsl:value-of select="$payment_date_name"/>
									<xsl:value-of select="' '" />
									<xsl:value-of select="$payment_date" />
								</fo:block>
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:block>
				<xsl:if test="$exempt_reason != ''">
					<fo:block>
						<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.ExemptReason')"/>
						<xsl:value-of select="': '" />
					</fo:block>
					<fo:block>
						<xsl:value-of select="$exempt_reason" />
					</fo:block>
				</xsl:if>
			</fo:block>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:block>
				<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Remarks')"/>
				<xsl:value-of select="': '" />
			</fo:block>
			<fo:block>
				<xsl:value-of select="$remarks" />
			</fo:block>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:block>
				<fo:leader />
			</fo:block>
			<fo:table>
				<fo:table-column column-width="50%" />
				<fo:table-column column-width="50%" />
				<fo:table-body>
					<fo:table-row>
						<fo:table-cell text-align="left">
							<fo:block>
								<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.sellerSignature')"/>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell text-align="right">
							<fo:block>
								<xsl:value-of select="resources:getString('micro.process.invoice_sale_new.Print.buyerSignature')"/>
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
        </fo:flow>
      </fo:page-sequence>
    </fo:root>
  </xsl:template>

  <xsl:template match="invoiceSellElements">
		<fo:table-row border-bottom="solid black">
			<fo:table-cell border-right="solid black" text-align="center">
				<fo:block margin="0.5mm">
					<xsl:value-of select="nr"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="center">
				<fo:block margin="0.5mm">
					<xsl:value-of select="name"/>
				</fo:block>
				<fo:block margin="0.5mm">
					<xsl:value-of select="description"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="unit"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="unitPrice"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="quantity"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="center">
				<fo:block margin="0.5mm">
					<xsl:value-of select="taxrate"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="sumNet"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="sumTax"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="sumBrut"/>
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
	</xsl:template>

	<xsl:template match="summaryTable">
		<fo:table-row border-bottom="solid black">
			<fo:table-cell border-right="solid black" text-align="center">
				<fo:block margin="0.5mm">
					<xsl:value-of select="taxRate" />
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="netSum"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="taxSum"/>
				</fo:block>
			</fo:table-cell>
			<fo:table-cell border-right="solid black" text-align="right">
				<fo:block margin="0.5mm">
					<xsl:value-of select="brutSum"/>
				</fo:block>
			</fo:table-cell>
		</fo:table-row>
	</xsl:template>

	<xsl:template name="intersperse-with-zero-spaces">
	<xsl:param name="str"/>
	<xsl:variable name="spacechars">
		&#x9;&#xA;
		&#x2000;&#x2001;&#x2002;&#x2003;&#x2004;&#x2005;
		&#x2006;&#x2007;&#x2008;&#x2009;&#x200A;&#x200B;
	</xsl:variable>

	<xsl:if test="string-length($str) &gt; 0">
		<xsl:variable name="c1" select="substring($str, 1, 1)"/>
		<xsl:variable name="c2" select="substring($str, 2, 1)"/>

		<xsl:value-of select="$c1"/>
		<xsl:if test="$c2 != '' and
			not(contains($spacechars, $c1) or
			contains($spacechars, $c2))">
			<xsl:text>&#x200B;</xsl:text>
		</xsl:if>

		<xsl:call-template name="intersperse-with-zero-spaces">
			<xsl:with-param name="str" select="substring($str, 2)"/>
		</xsl:call-template>
	</xsl:if>
	</xsl:template>

</xsl:stylesheet>