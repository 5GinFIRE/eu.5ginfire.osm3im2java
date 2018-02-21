package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list volumes {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf volume-id {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf size {
 *         type uint64;
 *     }
 *     choice volume-source {
 *         case ephemeral {
 *             leaf ephemeral {
 *                 type empty;
 *             }
 *         }
 *         case image {
 *             leaf image {
 *                 type string;
 *             }
 *             leaf image-checksum {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf device-bus {
 *         type enumeration;
 *     }
 *     leaf device-type {
 *         type enumeration;
 *     }
 *     uses volume-info;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/volumes</i>
 * 
 * <p>To create instances of this class use {@link VolumesBuilder}.
 * @see VolumesBuilder
 * @see VolumesKey
 *
 */
public interface Volumes
    extends
    ChildOf<Vdur>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>,
    VolumeInfo,
    Identifiable<VolumesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "volumes").intern();

    /**
     * Name of the disk-volumes, e.g. vda, vdb etc
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * VIM assigned volume id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>volumeId</code>, or <code>null</code> if not present
     */
    java.lang.String getVolumeId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VolumesKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VolumesKey getKey();

}

