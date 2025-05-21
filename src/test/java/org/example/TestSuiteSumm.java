package org.example;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;

@Suite
@IncludeTags("param_summ")
@SelectPackages("org.example")

public class TestSuiteSumm {
}
