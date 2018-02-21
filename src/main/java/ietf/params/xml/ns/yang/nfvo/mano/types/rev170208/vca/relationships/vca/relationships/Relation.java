package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of relations between VCA componets.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list relation {
 *     key "requires" "provides";
 *     leaf requires {
 *         type string;
 *     }
 *     leaf provides {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-relationships/vca-relationships/relation</i>
 * 
 * <p>To create instances of this class use {@link RelationBuilder}.
 * @see RelationBuilder
 * @see RelationKey
 *
 */
public interface Relation
    extends
    ChildOf<VcaRelationships>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>,
    Identifiable<RelationKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "relation").intern();

    /**
     * Name of the required relation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>requires</code>, or <code>null</code> if not present
     */
    java.lang.String getRequires();
    
    /**
     * Name of the provided relation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>provides</code>, or <code>null</code> if not present
     */
    java.lang.String getProvides();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.RelationKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RelationKey getKey();

}

