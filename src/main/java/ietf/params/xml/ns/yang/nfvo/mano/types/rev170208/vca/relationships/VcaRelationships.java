package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vca-relationships {
 *     list relation {
 *         key "requires" "provides";
 *         leaf requires {
 *             type string;
 *         }
 *         leaf provides {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-relationships/vca-relationships</i>
 * 
 * <p>To create instances of this class use {@link VcaRelationshipsBuilder}.
 * @see VcaRelationshipsBuilder
 *
 */
public interface VcaRelationships
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaRelationships>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "vca-relationships").intern();

    /**
     * List of relations between VCA componets.
     *
     *
     *
     * @return <code>java.util.List</code> <code>relation</code>, or <code>null</code> if not present
     */
    List<Relation> getRelation();

}

