package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduBuilder.VduImpl;

/**
 * Indicates how the contents of cloud-init script are provided.There are 2 
 * - inline or in a file
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice cloud-init-input {
 *     case filename {
 *         leaf cloud-init-file {
 *             type string;
 *         }
 *     }
 *     case inline {
 *         leaf cloud-init {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input</i>
 *
 */
public interface CloudInitInput
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "cloud-init-input").intern();


}

