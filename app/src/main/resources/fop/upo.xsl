<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet
     version="1.1"
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
     xmlns:fo="http://www.w3.org/1999/XSL/Format"
     exclude-result-prefixes="fo" >

<xsl:output method="xml" version="1.0" omit-xml-declaration="no" indent="yes"/>
<xsl:param name="documentReceiver" /> <!-- NazwaPodmiotuPrzyjmujacego -->
<xsl:param name="documentId" /> <!-- NumerReferencyjny -->
<xsl:param name="documentDateTime" /> <!-- DataWplyniecia -->
<xsl:param name="documentCheckSum" /> <!-- SkrotDokumentu -->
<xsl:param name="documentSignedCheckSum" /> <!-- SkrotZlozonejStruktury -->
<xsl:param name="documentLogicalStructure" /> <!-- NazwaStrukturyLogicznej -->
<xsl:param name="documentIdentifierFirst" /> <!-- NIP1; PESEL1; NumerIdentyfikacyjny -->
<xsl:param name="documentIdentifierSecond" /> <!-- NIP2; PESEL2 -->
<xsl:param name="documentTaxOffice" /> <!-- KodUrzedu -->
<xsl:param name="documentBase64Timestamp" /> <!-- StempelCzasu -->
<xsl:param name="documentFormCode" /> <!-- KodFormularza -->
<xsl:param name="documentFormSchema" /> <!-- wersjaSchemy -->
<xsl:param name="documentGenerationDateTime" />
<!-- Przyjeto -->
<!-- Blad -->

<xsl:template match ="upo">

<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">

  <fo:layout-master-set>

    <fo:simple-page-master master-name="simple"
                  page-height="29.7cm"
                  page-width="21cm"
                  margin-top="0.0cm"
                  margin-bottom="2cm"
                  margin-left="1.0cm"
                  margin-right="1.0cm">
      <fo:region-body margin-top="3cm"/>
      <fo:region-before extent="3cm"/>
      <fo:region-after extent="1.5cm"/>
    </fo:simple-page-master>
  </fo:layout-master-set>

  <fo:page-sequence master-reference="simple">

    <fo:flow flow-name="xsl-region-body">

	<fo:table table-layout="fixed" width="100%" space-after="5" >
		<fo:table-body >
			<fo:table-row>
				<fo:table-cell number-rows-spanned="2" width="40" display-align="center" >
					<fo:block>
						<fo:external-graphic 
							content-width="{document/header/logo/width}" 
							content-height="{document/header/logo/height}" 
							src="{document/header/logo/icon}" />
					</fo:block>
				</fo:table-cell>
				<fo:table-cell >
					<fo:block font-family="jpkLocalFont" font-weight="bold" font-style="normal" font-size="16" display-align="center" text-align="center" line-height="24pt" >
					<xsl:value-of select="document/header/title/line1"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row>
				<fo:table-cell font-family="jpkLocalFont" font-weight="bold" font-style="normal" font-size="14" display-align="center" text-align="center" >
					<fo:block>
						<xsl:value-of select="document/header/title/line2"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
		</fo:table-body>
	</fo:table>

	<fo:table table-layout="fixed" width="100%" border="solid black" space-after="5" >
		<fo:table-column column-width="20"/>
		<fo:table-column column-width="proportional-column-width(1)" />
		<fo:table-body >
			<fo:table-row background-color="lightgrey" >
				<fo:table-cell number-columns-spanned="2" display-align="center" >
					<fo:block font-family="jpkLocalFont" font-weight="bold" font-style="normal" font-size="12" display-align="center" text-align="left" line-height="24pt" margin-left ="10" >
						<xsl:value-of select="document/body/table1/row1/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row height="55" >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="14" display-align="center" text-align="center" border-left="solid black" border-top="solid black" >
					<fo:block>
					<xsl:value-of select="$documentReceiver"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
		</fo:table-body>
	</fo:table>

	<fo:table table-layout="fixed" width="100%" border="solid black" space-after="15" >
		<fo:table-column column-width="20"/>
		<fo:table-column column-width="proportional-column-width(1)" />
		<fo:table-column column-width="proportional-column-width(1)" />
		<fo:table-body >
			<fo:table-row background-color="lightgrey" border="solid black" >
				<fo:table-cell number-columns-spanned="3" display-align="center" >
					<fo:block font-family="jpkLocalFont" font-weight="bold" font-style="normal" font-size="12" display-align="center" text-align="left" line-height="24pt" margin-left ="10" >
						<xsl:value-of select="document/body/table2/row1/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row background-color="lightgrey">
				<fo:table-cell><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" line-height="24pt" margin-left ="10" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row2/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row height="1" >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row3/column1/value"/>
					</fo:block>
				</fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row3/column2/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row  >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentId"/>
					</fo:block>
				</fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentDateTime"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row4/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row  >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="10" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentCheckSum"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row5/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row  >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentSignedCheckSum"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row6/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row  >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentLogicalStructure"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row7/column1/value"/>
					</fo:block>
				</fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row7/column2/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row  >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentIdentifierFirst"/>
					</fo:block>
				</fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentIdentifierSecond"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row8/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row  >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentTaxOffice"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row9/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row  >
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-left="solid black" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentBase64Timestamp"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell number-columns-spanned="2" font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" border-left="solid black" border-top="solid black" border-right="solid black" padding-top="3" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row10/value"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>
			<fo:table-row>
				<fo:table-cell background-color="lightgrey"><fo:block></fo:block></fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="11" display-align="center" text-align="left" margin-left ="10" line-height="30pt" border-left="solid black" border-bottom="solid black" >
					<fo:block>
					<xsl:value-of select="document/body/table2/row10/column1/value"/>
					</fo:block>
				</fo:table-cell>
				<fo:table-cell font-family="jpkLocalFont" font-size="16" display-align="center" text-align="center" line-height="30pt" border-bottom="solid black" border-right="solid black" >
					<fo:block>
					<xsl:value-of select="$documentGenerationDateTime"/>
					</fo:block>
				</fo:table-cell>
			</fo:table-row>

		</fo:table-body>
	</fo:table>

		<fo:block font-family="jpkLocalFont" font-weight="bold" font-style="normal" font-size="12" display-align="center" text-align="right">
			<fo:inline border-top="solid black" border-bottom="solid black" border-left="solid black" padding="5">
				<xsl:value-of select="document/body/table3/row1/value"/> (<xsl:value-of select="$documentFormSchema"/>)
			</fo:inline>
			<fo:inline border="solid black" padding="5">
				1/1
			</fo:inline>
		</fo:block>

    </fo:flow>
  </fo:page-sequence>
</fo:root>

</xsl:template>
</xsl:stylesheet>