package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of alternative images per VIM type.Different images can be used for 
 * specific types of VIMs insteadof the default image. This allows deployments in 
 * sites where theimage identifier in the VIM is given by the VIM provider 
 * andcannot be modified.If an alternative image is specified for a VIM type, it 
 * will prevailover the default image
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list alternative-images {
 *     key "vim-type";
 *     leaf vim-type {
 *         type string;
 *     }
 *     leaf image {
 *         type string;
 *     }
 *     leaf image-checksum {
 *         type string;
 *     }
 *     uses image-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/alternative-images</i>
 * 
 * <p>To create instances of this class use {@link AlternativeImagesBuilder}.
 * @see AlternativeImagesBuilder
 * @see AlternativeImagesKey
 *
 */
public interface AlternativeImages
    extends
    ChildOf<Vdu>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>,
    ImageProperties,
    Identifiable<AlternativeImagesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "alternative-images").intern();

    /**
     * VIM type: openvim, openstack, vmware, aws, etc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimType</code>, or <code>null</code> if not present
     */
    java.lang.String getVimType();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImagesKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AlternativeImagesKey getKey();

}

