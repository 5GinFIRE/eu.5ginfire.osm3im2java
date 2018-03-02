package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for custom vim data
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping supplemental-boot-data {
 *     container supplemental-boot-data {
 *         list config-file {
 *             key "source";
 *             leaf source {
 *                 type string;
 *             }
 *             leaf dest {
 *                 type string;
 *             }
 *         }
 *         leaf boot-data-drive {
 *             type boot-data-drive;
 *         }
 *         uses config-file;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/supplemental-boot-data</i>
 *
 */
public interface SupplementalBootData
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "supplemental-boot-data").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData</code> <code>supplementalBootData</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData getSupplementalBootData();

}

