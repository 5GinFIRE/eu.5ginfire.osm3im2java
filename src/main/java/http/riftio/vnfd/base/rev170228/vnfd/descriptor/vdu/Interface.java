package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import http.riftio.vnfd.base.rev170228.InterfaceType;
import http.riftio.vnfd.base.rev170228.VirtualInterface;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.InterfaceBuilder.InterfaceImpl;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of Interfaces (external and internal) for the VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list interface {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf position {
 *         type uint32;
 *     }
 *     leaf type {
 *         type type;
 *     }
 *     leaf mac-address {
 *         type string;
 *     }
 *     choice connection-point-type {
 *         case external {
 *             leaf external-connection-point-ref {
 *                 type string;
 *             }
 *         }
 *         case internal {
 *             leaf internal-connection-point-ref {
 *                 type string;
 *             }
 *         }
 *     }
 *     container virtual-interface {
 *         leaf type {
 *             type type;
 *         }
 *         leaf vpci {
 *             type string;
 *         }
 *         leaf bandwidth {
 *             type uint64;
 *         }
 *     }
 *     uses virtual-interface;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/interface</i>
 * 
 * <p>To create instances of this class use {@link InterfaceBuilder}.
 * @see InterfaceBuilder
 * @see InterfaceKey
 *
 */
@JsonDeserialize(as = InterfaceImpl.class)
@JsonIgnoreProperties({"rw-project-vnfd:floating-ip-needed"})
public interface Interface
    extends
    ChildOf<Vdu>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>,
    VirtualInterface,
    Identifiable<InterfaceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "interface").intern();

    /**
     * Name of the interface. Note that thisname has only local significance to the 
     * VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Explicit Position of the interface within the list
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>position</code>, or <code>null</code> if not present
     */
    java.lang.Long getPosition();
    
    /**
     * Type of the Interface
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.InterfaceType</code> <code>type</code>, or <code>null</code> if not present
     */
    InterfaceType getType();
    
    /**
     * MAC address of the interface.Some VNFs require a specific MAC address to be 
     * configuredin the interface. While this is not recommended at all inNFV 
     * environments, this parameter exists to allow thosescenarios.This parameter will 
     * be likely deprecated in the future.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getMacAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType</code> <code>connectionPointType</code>, or <code>null</code> if not present
     */
    ConnectionPointType getConnectionPointType();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.InterfaceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InterfaceKey getKey();

}

