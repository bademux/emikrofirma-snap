<?xml version="1.0"?>
<fop version="1.0">
	<base>.</base>
	<source-resolution>72</source-resolution>
	<target-resolution>72</target-resolution>
	<default-page-settings height="297mm" width="210mm" />
	<renderers>
		<renderer mime="application/pdf">
			<filterList>
				<value>flate</value>
			</filterList>
			<fonts>
				<font metrics-url="/fop/metrics/Times_New_Roman_Bold_Italic.xml"
					kerning="yes" embed-url="/fop/fonts/Times_New_Roman_Bold_Italic.ttf">
					<font-triplet name="jpkLocalFont" style="italic" weight="bold" />
				</font>
				<font metrics-url="/fop/metrics/Times_New_Roman_Bold.xml"
					kerning="yes" embed-url="/fop/fonts/Times_New_Roman_Bold.ttf">
					<font-triplet name="jpkLocalFont" style="normal" weight="bold" />
				</font>
				<font metrics-url="/fop/metrics/Times_New_Roman_Italic.xml"
					kerning="yes" embed-url="/fop/fonts/Times_New_Roman_Italic.ttf">
					<font-triplet name="jpkLocalFont" style="italic" weight="normal" />
				</font>
				<font metrics-url="/fop/metrics/Times_New_Roman.xml"
					kerning="yes" embed-url="/fop/fonts/Times_New_Roman.ttf">
					<font-triplet name="jpkLocalFont" style="normal" weight="normal" />
				</font>
			</fonts>
		</renderer>
		<renderer mime="application/postscript">
		</renderer>
		<renderer mime="application/vnd.hp-PCL">
		</renderer>
		<renderer mime="image/svg+xml">
			<format type="paginated" />
			<link value="true" />
			<strokeText value="false" />
		</renderer>
		<renderer mime="application/awt">
		</renderer>
		<renderer mime="image/png">
		</renderer>
		<renderer mime="image/tiff">
		</renderer>
		<renderer mime="text/xml">
		</renderer>
		<renderer mime="text/plain">
			<pageSize columns="80" />
		</renderer>
	</renderers>
</fop>