package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Use custom script for configuring the VNF or VDU.This script is executed in the 
 * context ofOrchestrator (The same system and environmentas the Launchpad).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case script {
 *     container script {
 *         leaf script-type {
 *             type enumeration;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/script</i>
 *
 */
public interface Script
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>,
    ConfigMethod
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "script").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script</code> <code>script</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script getScript();

}

