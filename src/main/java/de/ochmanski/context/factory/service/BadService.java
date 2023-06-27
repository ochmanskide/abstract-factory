package de.ochmanski.context.factory.service;

import lombok.Builder;
import lombok.NonNull;
import org.jboss.logging.Logger;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigInteger;

@ParametersAreNonnullByDefault
@ApplicationScoped
public class BadService
{

  @Inject
  Logger log;

  @NonNull
  @NotNull
  @javax.validation.constraints.NotNull
  @PositiveOrZero
  @Builder.Default
  BigInteger state = BigInteger.ZERO;

}
