package a.a.a.c.e.a.f;

import a.a.a.c.e.a.g.EWX;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.nio.charset.StandardCharsets.UTF_8;

@Slf4j
public class EWI implements EWG<JSONObject> {
    public EWI() {
    }

    public JSONObject IAP(InputStream is, EWX var2, Long var3) throws IOException {
        if (is == null) {
            return null;
        }
        try(is) {
            return (JSONObject) new JSONParser().parse(new InputStreamReader(is));
        } catch (ParseException e) {
            log.error("Something bad happened", e);
            return null;
        }
    }

    public JSONObject IAO(InputStream is) throws IOException {
        return this.IAP(is, null, null);
    }
}
