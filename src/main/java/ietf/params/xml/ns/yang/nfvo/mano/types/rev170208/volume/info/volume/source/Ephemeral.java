package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case ephemeral {
 *     leaf ephemeral {
 *         type empty;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source/ephemeral</i>
 *
 */
public interface Ephemeral
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>,
    VolumeSource
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "ephemeral").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>ephemeral</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEphemeral();

}

