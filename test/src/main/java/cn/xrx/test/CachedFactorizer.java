package cn.xrx.test;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @author Administrator
 */
public class CachedFactorizer  implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private long hits;
    private long cacheHits;

    public synchronized  long getHits() {return hits;}
    public synchronized  double getCacheHitRatio() {
        return (double)cacheHits / (double) hits;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
//        BigInteger i = extractFromRequest(req);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
