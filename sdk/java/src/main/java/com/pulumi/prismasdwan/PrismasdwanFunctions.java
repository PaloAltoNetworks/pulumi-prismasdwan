// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.prismasdwan;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.prismasdwan.Utilities;
import com.pulumi.prismasdwan.inputs.GetSiteArgs;
import com.pulumi.prismasdwan.inputs.GetSitePlainArgs;
import com.pulumi.prismasdwan.outputs.GetSiteResult;
import java.util.concurrent.CompletableFuture;

public final class PrismasdwanFunctions {
    /**
     * Retrieves the JSON pull-site info for a given site.  This can then be updated and sebsequently fed into the prismasdwan.Site resource.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.prismasdwan.PrismasdwanFunctions;
     * import com.pulumi.prismasdwan.inputs.GetSiteArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var site1 = PrismasdwanFunctions.getSite(GetSiteArgs.builder()
     *             .siteName("Site1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSiteResult> getSite(GetSiteArgs args) {
        return getSite(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the JSON pull-site info for a given site.  This can then be updated and sebsequently fed into the prismasdwan.Site resource.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.prismasdwan.PrismasdwanFunctions;
     * import com.pulumi.prismasdwan.inputs.GetSiteArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var site1 = PrismasdwanFunctions.getSite(GetSiteArgs.builder()
     *             .siteName("Site1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSiteResult> getSitePlain(GetSitePlainArgs args) {
        return getSitePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the JSON pull-site info for a given site.  This can then be updated and sebsequently fed into the prismasdwan.Site resource.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.prismasdwan.PrismasdwanFunctions;
     * import com.pulumi.prismasdwan.inputs.GetSiteArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var site1 = PrismasdwanFunctions.getSite(GetSiteArgs.builder()
     *             .siteName("Site1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSiteResult> getSite(GetSiteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("prismasdwan:index/getSite:getSite", TypeShape.of(GetSiteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the JSON pull-site info for a given site.  This can then be updated and sebsequently fed into the prismasdwan.Site resource.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.prismasdwan.PrismasdwanFunctions;
     * import com.pulumi.prismasdwan.inputs.GetSiteArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var site1 = PrismasdwanFunctions.getSite(GetSiteArgs.builder()
     *             .siteName("Site1")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSiteResult> getSitePlain(GetSitePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("prismasdwan:index/getSite:getSite", TypeShape.of(GetSiteResult.class), args, Utilities.withVersion(options));
    }
}