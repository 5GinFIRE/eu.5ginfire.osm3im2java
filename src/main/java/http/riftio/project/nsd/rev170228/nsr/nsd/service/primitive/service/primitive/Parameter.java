package http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.ServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of parameters for the service primitive.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list parameter {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf data-type {
 *         type parameter-data-type;
 *     }
 *     leaf mandatory {
 *         type mandatory;
 *     }
 *     leaf default-value {
 *         type string;
 *     }
 *     leaf parameter-pool {
 *         type string;
 *     }
 *     leaf read-only {
 *         type read-only;
 *     }
 *     leaf hidden {
 *         type hidden;
 *     }
 *     uses primitive-parameter;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-service-primitive/service-primitive/parameter</i>
 * 
 * <p>To create instances of this class use {@link ParameterBuilder}.
 * @see ParameterBuilder
 * @see ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<ServicePrimitive>,
    Augmentable<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>,
    PrimitiveParameter,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "parameter").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.ParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterKey getKey();

}

