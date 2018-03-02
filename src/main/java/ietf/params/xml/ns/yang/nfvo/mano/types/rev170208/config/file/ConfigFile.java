package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of configuration files to be written on an additional drive
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list config-file {
 *     key "source";
 *     leaf source {
 *         type string;
 *     }
 *     leaf dest {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/config-file/config-file</i>
 * 
 * <p>To create instances of this class use {@link ConfigFileBuilder}.
 * @see ConfigFileBuilder
 * @see ConfigFileKey
 *
 */
public interface ConfigFile
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>,
    Identifiable<ConfigFileKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "config-file").intern();

    /**
     * Name of the configuration file
     *
     *
     *
     * @return <code>java.lang.String</code> <code>source</code>, or <code>null</code> if not present
     */
    java.lang.String getSource();
    
    /**
     * Full path of the destination in the guest
     *
     *
     *
     * @return <code>java.lang.String</code> <code>dest</code>, or <code>null</code> if not present
     */
    java.lang.String getDest();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFileKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConfigFileKey getKey();

}

