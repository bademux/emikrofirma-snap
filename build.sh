#!/bin/sh

mkdir -p source/emikrofirma && cd source/emikrofirma
#b35c9a2153c5bdfd1f7d0133a3a4ce130d63156f92e3d214372e70a56d1860d3  e-mikrofirma_1-3-0-10-tar.gz
wget -c https://www.podatki.gov.pl/media/6048/e-mikrofirma_1-3-0-10-tar.gz -O - | tar -xz
cd ../../
unzip -p source/emikrofirma/micro/MicroLauncher.lib img/app/e_logo.png > source/icon.png
snapcraft
