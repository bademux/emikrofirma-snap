# About
This is redistibution of e-mikrofirma app. https://www.podatki.gov.pl/jednolity-plik-kontrolny/jpk_vat/aplikacje-do-pobrania/

# Bonus Feature
You can put ~/AKMF/homedir file with path to new homedir, like ```mkdir -p ~/AKMF && echo 'Dropbox/Apps' > ~/AKMF/homedir```
directory should be in user's home ("~/Dropbox/Apps" in our example), and can't be hidden.

# Bugs
- pdf invoice isn't opened automatically. please find it in ~/AKMF/emikrofirma
After klicking  "Drukuj" please find generaded PDF in pdf invoice not opened. please find it in ~/AKMF. You can change directory in settings (bug info: https://forum.snapcraft.io/t/open-pdf-file-with-java8-app-in-external-viewer/20282)

# Install & Run 
## snapcraft.io
```snap install e-mikrofirma```
## Localy
```snap install --devmode e-mikrofirma_1-3-0-10_amd64.snap && /snap/bin/e-mikrofirma.app```

