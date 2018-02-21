package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.event.service.primitive.Parameter;

import java.math.BigInteger;
import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping event-service-primitive {
 *     leaf seq {
 *         type uint64;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/event-service-primitive</i>
 *
 */
public interface EventServicePrimitive
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "event-service-primitive").intern();

    /**
     * Sequence number for the service primitive.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>seq</code>, or <code>null</code> if not present
     */
    BigInteger getSeq();
    
    /**
     * Name of the service primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    java.lang.String getUserDefinedScript();
    
    /**
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    List<Parameter> getParameter();

}

