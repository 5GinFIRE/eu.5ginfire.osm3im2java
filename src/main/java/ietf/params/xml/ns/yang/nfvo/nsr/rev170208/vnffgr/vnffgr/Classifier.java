package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list classifier {
 *     key "id";
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf-list classifier-id {
 *         type uuid;
 *     }
 *     leaf rsp-id-ref {
 *         type leafref;
 *     }
 *     leaf rsp-name {
 *         type string;
 *     }
 *     leaf vnfr-id-ref {
 *         type string;
 *     }
 *     leaf vnfr-name-ref {
 *         type string;
 *     }
 *     leaf vnfr-connection-point-ref {
 *         type leafref;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf vm-id {
 *         type string;
 *     }
 *     leaf ip-address {
 *         type string;
 *     }
 *     leaf sff-name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/classifier</i>
 * 
 * <p>To create instances of this class use {@link ClassifierBuilder}.
 * @see ClassifierBuilder
 * @see ClassifierKey
 *
 */
public interface Classifier
    extends
    ChildOf<Vnffgr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>,
    Identifiable<ClassifierKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "classifier").intern();

    /**
     * Identifier for the classifier rule.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * Name of the classifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Returned Identifier for the classifier rule.
     *
     *
     *
     * @return <code>java.util.List</code> <code>classifierId</code>, or <code>null</code> if not present
     */
    List<Uuid> getClassifierId();
    
    /**
     * A reference to the RSP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>rspIdRef</code>, or <code>null</code> if not present
     */
    Uuid getRspIdRef();
    
    /**
     * Name for the RSP
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rspName</code>, or <code>null</code> if not present
     */
    java.lang.String getRspName();
    
    /**
     * A reference to a vnfr id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfrIdRef();
    
    /**
     * A reference to a vnfr name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrNameRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfrNameRef();
    
    /**
     * A reference to a vnfr connection point.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfrConnectionPointRef();
    
    /**
     * @return <code>java.lang.String</code> <code>portId</code>, or <code>null</code> if not present
     */
    java.lang.String getPortId();
    
    /**
     * @return <code>java.lang.String</code> <code>vmId</code>, or <code>null</code> if not present
     */
    java.lang.String getVmId();
    
    /**
     * @return <code>java.lang.String</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getIpAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>sffName</code>, or <code>null</code> if not present
     */
    java.lang.String getSffName();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.ClassifierKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ClassifierKey getKey();

}

