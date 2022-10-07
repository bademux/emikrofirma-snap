<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.1"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
                exclude-result-prefixes="fo"
                xmlns:resources="a.a.a.c.c.e.f.a.ETI">

    <xsl:output method="xml" version="1.0" omit-xml-declaration="yes"
                indent="yes" encoding="utf-8"/>

    <xsl:param name="month"/>
    <xsl:param name="year"/>
    <xsl:param name="isPurchase"/>
    <xsl:param name="elements"/>
    <xsl:param name="contractorName"/>
    <xsl:param name="contractorFirstName"/>
    <xsl:param name="contractorSurname"/>
    <xsl:param name="contractorNIP"/>
    <xsl:param name="contractorStreet"/>
    <xsl:param name="contractorHouseNumber"/>
    <xsl:param name="contractorApartmentNumber"/>
    <xsl:param name="contractorPostalCode"/>
    <xsl:param name="contractorCity"/>


    <xsl:template match="invoiceRecord">
        <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="simpleA4"
                                       page-height="21cm" page-width="29.7cm" margin-top="2cm"
                                       margin-bottom="2cm" margin-left="1cm" margin-right="1cm">
                    <fo:region-body/>
                    <fo:region-after/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="simpleA4" id="page"
                              font-size="8" font-family="jpkLocalFont">
                <fo:static-content flow-name="xsl-region-after">
                    <fo:block padding-top="1cm">
                        <fo:table width="100%">
                            <fo:table-body>
                                <fo:table-row>
                                    <fo:table-cell text-align="left">
                                        <fo:block>
                                            <xsl:value-of
                                                    select="resources:getString('micro.process.invoices_records.print.printFrom')"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right">
                                        <fo:block>
                                            <xsl:value-of
                                                    select="resources:getString('micro.process.invoices_records.print.page')"/>
                                            <xsl:value-of select="' '"/>
                                            <fo:page-number font-weight="bold"/>
                                            <xsl:value-of select="' '"/>
                                            <xsl:value-of
                                                    select="resources:getString('micro.process.invoices_records.print.of')"/>
                                            <xsl:value-of select="' '"/>
                                            <fo:page-number-citation-last
                                                    font-weight="bold" ref-id="page"/>
                                        </fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </fo:table-body>
                        </fo:table>
                    </fo:block>
                </fo:static-content>
                <fo:flow flow-name="xsl-region-body">
                    <fo:table width="100%" margin-bottom="2cm">
                        <fo:table-body>
                            <fo:table-row>
                                <fo:table-cell font-size="12">
                                    <fo:block>
                                        <fo:inline font-weight="bold" text-transform="uppercase">
                                            <xsl:choose>
                                                <xsl:when test="$isPurchase">
                                                    <xsl:value-of
                                                            select="resources:getString('micro.process.invoices_records.print.purchaseInvoicesRecords')"/>
                                                </xsl:when>
                                                <xsl:otherwise>
                                                    <xsl:value-of
                                                            select="resources:getString('micro.process.invoices_records.print.sellInvoicesRecords')"/>
                                                </xsl:otherwise>
                                            </xsl:choose>
                                        </fo:inline>
                                        <xsl:value-of select="' '"/>
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.print.for')"/>
                                        <xsl:value-of select="' '"/>
                                        <xsl:value-of select="$month"/>
                                        <xsl:value-of select="' '"/>
                                        <xsl:value-of select="$year"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" font-size="12">
                                    <fo:block>
                                        <xsl:value-of select="$contractorName"/>
                                    </fo:block>
                                    <fo:block>
                                        <xsl:value-of select="$contractorFirstName"/>
                                        <xsl:value-of select="' '"/>
                                        <xsl:value-of select="$contractorSurname"/>
                                    </fo:block>
                                    <fo:block>
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.contractorNip')"/>
                                        <xsl:value-of select="': '"/>
                                        <xsl:value-of select="$contractorNIP"/>
                                    </fo:block>
                                    <fo:block>
                                        <xsl:value-of select="$contractorStreet"/>
                                        <xsl:value-of select="' '"/>
                                        <xsl:value-of select="$contractorHouseNumber"/>
                                        <xsl:if test="$contractorApartmentNumber != ''">
                                            <xsl:value-of select="' '"/>
                                            <xsl:value-of
                                                    select="resources:getString('micro.process.invoices_records.apartmentAbbr')"/>
                                            <xsl:value-of select="' '"/>
                                            <xsl:value-of select="$contractorApartmentNumber"/>
                                        </xsl:if>
                                    </fo:block>
                                    <fo:block>
                                        <xsl:value-of select="$contractorPostalCode"/>
                                        <xsl:value-of select="' '"/>
                                        <xsl:value-of select="$contractorCity"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>
                    <fo:table table-omit-footer-at-break="true">
                        <fo:table-column width="2.5%" column-width="2.5%"/>
                        <fo:table-column width="6%" column-width="6%"/>
                        <fo:table-column width="6%" column-width="6%"/>
                        <fo:table-column width="11%" column-width="11%"/>
                        <fo:table-column width="10%" column-width="10%"/>
                        <fo:table-column width="7%" column-width="7%"/>
                        <fo:table-column width="6%" column-width="6%"/>
                        <fo:table-column width="6%" column-width="6%"/>
                        <fo:table-column width="5%" column-width="5%"/>
                		<fo:table-column width="4.5%" column-width="4.5%"/>
                		<fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-column width="4.5%" column-width="4.5%"/>
                        <fo:table-header font-weight="bold" border-top="solid black"
                                         border-left="solid black">
                            <fo:table-row border-bottom="solid black"
                                          display-align="center" text-align="center">
                                <fo:table-cell border-right="solid black"
                                               number-rows-spanned="2">
                                    <fo:block margin-top="2mm" margin-bottom="2mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.number')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black"
                                               number-rows-spanned="2" margin-top="2mm" margin-bottom="2mm">
                                    <fo:block>
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.date')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black"
                                               number-rows-spanned="2" margin-top="2mm" margin-bottom="2mm">
                                    <fo:block>
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.documentNumber')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell number-columns-spanned="2"
                                               border-right="solid black">
                                    <fo:block font-weight="bold" margin-top="2mm"
                                              margin-bottom="2mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.contractor')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell number-rows-spanned="2"
                         	                   border-right="solid black">
                     	            <fo:block font-weight="bold" margin-top="2mm"
                   	                          margin-bottom="2mm">
              	                        <xsl:value-of
         	                                    select="resources:getString('micro.process.invoices_records.reason')"/>
      	                            </fo:block>
   	                            </fo:table-cell>
                                <fo:table-cell number-columns-spanned="3"
                                               border-right="solid black">
                                    <fo:block font-weight="bold" margin-top="2mm"
                                              margin-bottom="2mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.value')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell number-columns-spanned="9"
                                             		border-right="solid black">
                                  	<fo:block font-weight="bold" margin-top="2mm"
                                            	margin-bottom="2mm">
                                      	<xsl:value-of
                                              	select="resources:getString('micro.process.invoices_records.vatRates')"/>
                                  	</fo:block>
                                  </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row border-bottom="solid black"
                                          display-align="center" text-align="center">
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.contractorName')"/>
                                    </fo:block>
                                    <fo:block>
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.contractorNip')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.contractorAddress')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.grossValue')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.netValue')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <fo:block>
                                            <xsl:value-of
                                                    select="resources:getString('micro.process.invoices_records.vatValue')"/>
                                        </fo:block>
                                        <fo:block margin-bottom="1mm">
                                            <xsl:value-of
                                                    select="resources:getString('micro.process.invoices_records.currency')"/>
                                        </fo:block>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vat23Col')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vat8Col')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vat5Col')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                               <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vat4Col')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vat0Col')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vatZwColAbbr')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vatNpColAbbr')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vatOo23ColAbbr')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell border-right="solid black">
                                    <fo:block margin-top="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.vatOo8ColAbbr')"/>
                                    </fo:block>
                                    <fo:block margin-bottom="1mm">
                                        <xsl:value-of
                                                select="resources:getString('micro.process.invoices_records.currency')"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-header>
                        <fo:table-footer>
                            <fo:table-row>
                            	<fo:table-cell number-columns-spanned="4">
									<fo:block/>
								</fo:table-cell>
                               	<fo:table-cell number-columns-spanned="2" border-right="solid black"
                         	               border-left="solid black" border-bottom="solid black"
                     	                   display-align="center" text-align="center">
		         	                    <fo:block text-transform="uppercase" margin="0.5mm">
		     	                            <xsl:value-of
		 	                                        select="resources:getString('micro.process.invoices_records.summary')"/>
		                                 </fo:block>
    	                       	</fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="gross"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="net"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat23Amount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat23Tax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat8Amount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat8Tax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat5Amount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat5Tax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
	                                           border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat4Amount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat4Tax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat0Amount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vat0Tax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatZwAmount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatZwTax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatNpAmount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatNpTax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid	black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatOo23Amount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatOo23Tax"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" border-right="solid black"
                                               border-bottom="solid black" font-size="7">
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatOo8Amount"/>
                                    </fo:block>
                                    <fo:block margin="0.5mm">
                                        <xsl:value-of select="vatOo8Tax"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-footer>
                        <fo:table-body border-left="solid black">
                            <xsl:if test="invoiceRecordElement">
                                <xsl:apply-templates select="invoiceRecordElement"/>
                            </xsl:if>
                            <xsl:if test="not(invoiceRecordElement)">
                                <fo:table-row border-bottom="solid black"
                                              page-break-inside="avoid">
                                    <fo:table-cell border-right="solid black" text-align="center">
                                        <fo:block margin="0.5mm">0</fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell border-right="solid black" text-align="center">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell border-right="solid black">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell border-right="solid black">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell display-align="center" border-right="solid black">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <xsl:if test="$isPurchase">
                                        <fo:table-cell display-align="center" border-right="solid black">
                                            <fo:block margin="0.5mm"/>
                                        </fo:table-cell>
                                    </xsl:if>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>

                                    <xsl:if test="not($isPurchase)">
                                    	<fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                       		<fo:block margin="0.5mm"/>
                                    	</fo:table-cell>
                                    </xsl:if>

                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                                        <fo:block margin="0.5mm"/>
                                    </fo:table-cell>
                                </fo:table-row>
                            </xsl:if>
                        </fo:table-body>
                    </fo:table>
                    <fo:block font-size="10" margin-top="1cm">
                        <fo:block text-transform="uppercase">
                            <xsl:value-of
                                    select="resources:getString('micro.process.invoices_records.print.tableSimbols')"/>
                        </fo:block>
                        <fo:block>
                            <xsl:value-of
                                    select="resources:getString('micro.process.invoices_records.vatNpColAbbr')"/>
                            <xsl:value-of select="' – '"/>
                            <xsl:value-of
                                    select="resources:getString('micro.process.invoices_records.vatNpCol')"/>
                        </fo:block>
                        <fo:block>
                            <xsl:value-of
                                    select="resources:getString('micro.process.invoices_records.vatZwColAbbr')"/>
                            <xsl:value-of select="' – '"/>
                            <xsl:value-of
                                    select="resources:getString('micro.process.invoices_records.vatZwCol')"/>
                        </fo:block>
                        <fo:block>
                            <xsl:value-of
                                    select="resources:getString('micro.process.invoices_records.vatOoColAbbr')"/>
                            <xsl:value-of select="' – '"/>
                            <xsl:value-of
                                    select="resources:getString('micro.process.invoices_records.vatOoCol')"/>
                        </fo:block>
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    <xsl:template match="invoiceRecordElement">
        <fo:table-row border-bottom="solid black"
                      page-break-inside="avoid">
            <fo:table-cell border-right="solid black" text-align="center">
                <fo:block margin="0.5mm">
                    <xsl:number/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell border-right="solid black" text-align="center">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="date"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell border-right="solid black">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="refId"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell border-right="solid black">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="contractor/name"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="contractor/nip"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell display-align="center" border-right="solid black">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="contractor/address/street"/>
                    <xsl:value-of select="' '"/>
                    <xsl:value-of select="contractor/address/houseNumber"/>
                    <xsl:if test="contractor/address/apartmentNumber != ''">
                        <xsl:value-of select="' '"/>
                        <xsl:value-of
                                select="resources:getString('micro.process.invoices_records.apartmentAbbr')"/>
                        <xsl:value-of select="' '"/>
                        <xsl:value-of select="contractor/address/apartmentNumber"/>
                    </xsl:if>

                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="contractor/address/postalCode"/>
                    <xsl:value-of select="' '"/>
                    <xsl:value-of select="contractor/address/city"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell display-align="center" border-right="solid black">
      	        <fo:block margin="0.5mm">
  	                <xsl:value-of select="taxReason"/>
  	            </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="gross"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="net"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat23Amount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat23Tax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat8Amount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat8Tax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat5Amount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat5Tax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat4Amount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat4Tax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat0Amount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vat0Tax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatZwAmount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatZwTax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatNpAmount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatNpTax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatOo23Amount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatOo23Tax"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell text-align="right" border-right="solid black" font-size="7">
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatOo8Amount"/>
                </fo:block>
                <fo:block margin="0.5mm">
                    <xsl:value-of select="vatOo8Tax"/>
                </fo:block>
            </fo:table-cell>
        </fo:table-row>
    </xsl:template>
</xsl:stylesheet>