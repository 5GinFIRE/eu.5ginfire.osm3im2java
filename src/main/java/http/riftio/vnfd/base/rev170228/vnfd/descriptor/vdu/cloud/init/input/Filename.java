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
 * case filename {
 *     leaf cloud-init-file {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input/filename</i>
 *
 */
public interface Filename
    extends
    DataObject,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>,
    CloudInitInput
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "filename").intern();

    /**
     * Name of file with contents of cloud-init script in cloud-config format
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudInitFile</code>, or <code>null</code> if not present
     */
    java.lang.String getCloudInitFile();

}

