package p405ms.p406bd.p407o.Pgl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: ms.bd.o.Pgl.pblr */
class pblr extends SSLSocketFactory {

    /* renamed from: b */
    private static final String[] f29888b = {(String) pblk.m33455a(16777217, 0, 0, "fe1361", new byte[]{67, 75, 113, 81, 88, 104, 55})};

    /* renamed from: a */
    final SSLSocketFactory f29889a;

    public pblr(SSLSocketFactory sSLSocketFactory) {
        this.f29889a = sSLSocketFactory;
    }

    /* renamed from: a */
    private Socket m33485a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f29888b);
        }
        return socket;
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return m33485a(this.f29889a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return m33485a(this.f29889a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m33485a(this.f29889a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m33485a(this.f29889a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m33485a(this.f29889a.createSocket(socket, str, i, z));
    }

    public String[] getDefaultCipherSuites() {
        return this.f29889a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f29889a.getSupportedCipherSuites();
    }
}
