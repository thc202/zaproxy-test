package org.zaproxy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.parosproxy.paros.core.scanner.KbUnitTest;
import org.parosproxy.paros.core.scanner.UtilUnitTest;
import org.zaproxy.zap.model.ContextUnitTest;
import org.zaproxy.zap.spider.URLResolverUnitTest;

import ch.csnc.extension.httpclient.AliasKeyManagerUnitTest;
import ch.csnc.extension.util.EncodingUnitTest;
import ch.csnc.extension.util.NullComparatorUnitTest;

/**
 * Suite for all unit tests of ZAP. Tests attached to this suite must run
 * independent of any environmental settings or preferences on any possible
 * machine.
 *
 * @author bjoern.kimminich@gmx.de
 */
@RunWith(Suite.class)
@SuiteClasses({ URLResolverUnitTest.class, AliasKeyManagerUnitTest.class,
		UtilUnitTest.class, EncodingUnitTest.class, KbUnitTest.class,
		ContextUnitTest.class, NullComparatorUnitTest.class })
public class ZaproxyUnitTestSuite {

}
