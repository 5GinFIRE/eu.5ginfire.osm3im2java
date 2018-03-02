package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case inline {
 *     leaf cloud-init {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input/inline</i>
 *
 */
public interface Inline
    extends
    DataObject,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>,
    CloudInitInput
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "inline").intern();

    /**
     * Contents of cloud-init script, provided inline, in cloud-config format
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudInit</code>, or <code>null</code> if not present
     */
    java.lang.String getCloudInit();

}

