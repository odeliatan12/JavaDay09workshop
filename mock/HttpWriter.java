// TODO: Change to your package 
package mywebserver;

import java.io.*;

public class HttpWriter {

    private final OutputStream out;

    public HttpWriter(OutputStream out) {
        this.out = out;
    }

	 public void flush() throws Exception {
		 this.out.flush();
	 }

    public void close() throws Exception {
        out.flush();
        out.close();
    }

    public void writeString() throws Exception {
        writeString("");
    }
    public void writeString(String line) throws Exception {
        writeBytes("%s\r\n".formatted(line).getBytes("utf-8"));
    }

    public void writeBytes(byte[] buffer) throws Exception {
        writeBytes(buffer, 0, buffer.length);
    }
    public void writeBytes(byte[] buffer, int start, int offset) throws Exception {
        out.write(buffer, start, offset);
    }
}
