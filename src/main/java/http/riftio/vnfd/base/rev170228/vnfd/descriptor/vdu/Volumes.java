package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list volumes {
 *     key "name";
 *     leaf name {
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
 * <i>vnfd-base/vnfd-descriptor/vdu/volumes</i>
 * 
 * <p>To create instances of this class use {@link VolumesBuilder}.
 * @see VolumesBuilder
 * @see VolumesKey
 *
 */
public interface Volumes
    extends
    ChildOf<Vdu>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Volumes>,
    VolumeInfo,
    Identifiable<VolumesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
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
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.VolumesKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VolumesKey getKey();

}

