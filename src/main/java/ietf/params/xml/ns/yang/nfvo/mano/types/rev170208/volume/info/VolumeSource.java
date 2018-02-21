package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the source of the volume. Possible options are1. Ephemeral -- Empty 
 * disk2. Image -- Refer to image to be used for volume3. Volume -- Reference of 
 * pre-existing volume to be used
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice volume-source {
 *     case ephemeral {
 *         leaf ephemeral {
 *             type empty;
 *         }
 *     }
 *     case image {
 *         leaf image {
 *             type string;
 *         }
 *         leaf image-checksum {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source</i>
 *
 */
public interface VolumeSource
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "volume-source").intern();


}

