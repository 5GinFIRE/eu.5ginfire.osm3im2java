package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Custom HTTP headers to put on HTTP request
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list headers {
 *     key "akey";
 *     leaf akey {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param/http-endpoint/headers</i>
 * 
 * <p>To create instances of this class use {@link HeadersBuilder}.
 * @see HeadersBuilder
 * @see HeadersKey
 *
 */
public interface Headers
    extends
    ChildOf<HttpEndpoint>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>,
    Identifiable<HeadersKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "headers").intern();

    /**
     * HTTP header key
     *
     *
     *
     * @return <code>java.lang.String</code> <code>akey</code>, or <code>null</code> if not present
     */
    java.lang.String getAkey();
    
    /**
     * HTTP header value
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    java.lang.String getValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.HeadersKey</code> <code>key</code>, or <code>null</code> if not present
     */
    HeadersKey getKey();

}

