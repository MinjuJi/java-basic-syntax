package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.commons.io.IOUtils;

public class URLApp {
    public static void main(String[] args) throws IOException {
        URL url = new URL(
                "https://i.namu.wiki/i/6ObhyGTCOyuVPfifVl5em1oFCOeAnJm840aKyd6Wk-zAVhIbzU-pvRUwJDYW69cm3EmlS3LzVLwPCF_XyQhYDRqYOijBQTWjU146uknr_VbA6F2CwyEgggTtiZzM8DlTC5D67-wFKMx_8D4dCwD63A.webp");
        InputStream in = url.openStream();
        FileOutputStream out = new FileOutputStream("src/io/sample.jpg");

        IOUtils.copy(in, out);
        in.close();
        out.close();
    }
}
