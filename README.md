# emikrofirma-snap
Try snapcraft in action. How it handle very dirty case.

# BUGS
- pdf invoice not opened auyomatically. please find it in ~/snap/e-mikrofirma/common/AKMF/emikrofirma
After klicking  "Drukuj" please find generaded PDF in pdf invoice not opened. please find it in ~/snap/e-mikrofirma/common/AKMF/emikrofirma. You can change directory in settings (bug info: https://forum.snapcraft.io/t/open-pdf-file-with-java8-app-in-external-viewer/20282)
# build
./build.sh

# install & run 
snap install --devmode  e-mikrofirma_0.1_amd64.snap && /snap/bin/e-mikrofirma.app

