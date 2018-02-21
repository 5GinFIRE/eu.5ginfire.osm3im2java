package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container cloud-config {
 *     list key-pair {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf akey {
 *             type string;
 *         }
 *     }
 *     list user {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-info {
 *             type string;
 *         }
 *         list key-pair {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf akey {
 *                 type string;
 *             }
 *         }
 *     }
 *     uses cloud-config;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/cloud-config</i>
 * 
 * <p>To create instances of this class use {@link CloudConfigBuilder}.
 * @see CloudConfigBuilder
 *
 */
public interface CloudConfig
    extends
    ChildOf<Vnfr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig>,
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CloudConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "cloud-config").intern();


}

