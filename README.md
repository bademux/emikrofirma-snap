# emikrofirma-snap
Try snapcraft in action. How it handle very dirty case.

# BUGS
- pdf invoice isn't opened automatically. please find it in ~/AKMF
After klicking  "Drukuj" please find generaded PDF in pdf invoice not opened. please find it in ~/AKMF. You can change directory in settings (bug info: https://forum.snapcraft.io/t/open-pdf-file-with-java8-app-in-external-viewer/20282)
# build
./build.sh

# install & run 
snap install --devmode  e-mikrofirma_0.1_amd64.snap && /snap/bin/e-mikrofirma.app

