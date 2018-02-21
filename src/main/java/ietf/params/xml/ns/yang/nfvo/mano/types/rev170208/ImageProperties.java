package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping image-properties {
 *     leaf image {
 *         type string;
 *     }
 *     leaf image-checksum {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/image-properties</i>
 *
 */
public interface ImageProperties
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "image-properties").intern();

    /**
     * Image name for the software image.If the image name is found within the VNF 
     * package it willbe uploaded to all VIM accounts during onboarding 
     * process.Otherwise, the image must be added to the VIM account withthe same name 
     * as entered here.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>image</code>, or <code>null</code> if not present
     */
    java.lang.String getImage();
    
    /**
     * Image md5sum for the software image.The md5sum, if provided, along with the 
     * image name uniquelyidentifies an image uploaded to the CAL.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>imageChecksum</code>, or <code>null</code> if not present
     */
    java.lang.String getImageChecksum();

}

