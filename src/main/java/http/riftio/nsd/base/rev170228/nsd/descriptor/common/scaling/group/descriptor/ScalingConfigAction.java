package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.ScalingTrigger;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of scaling config actions
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-config-action {
 *     key "trigger";
 *     leaf trigger {
 *         type scaling-trigger;
 *     }
 *     leaf ns-service-primitive-name-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-config-action</i>
 * 
 * <p>To create instances of this class use {@link ScalingConfigActionBuilder}.
 * @see ScalingConfigActionBuilder
 * @see ScalingConfigActionKey
 *
 */
public interface ScalingConfigAction
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>,
    Identifiable<ScalingConfigActionKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "scaling-config-action").intern();

    /**
     * scaling trigger
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.ScalingTrigger</code> <code>trigger</code>, or <code>null</code> if not present
     */
    ScalingTrigger getTrigger();
    
    /**
     * Reference to the NS service primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsServicePrimitiveNameRef</code>, or <code>null</code> if not present
     */
    java.lang.String getNsServicePrimitiveNameRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigActionKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingConfigActionKey getKey();

}

