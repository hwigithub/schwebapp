<template>
    <div id="app" class="site-wrapper">
      <div class="site-wrapper-inner">
        <div class="cover-container">
          <div id="app-navbar"></div>
          <div id="app-main"></div>
          <div id="app-footer"></div>
        </div>
      </div>
  </div>
</template>

<script>
export default {
  name: "app",
  data() {
    return {};
  }
};
</script>

<style lang="scss">
//colors
$white: #fff;
$color_mine_shaft_approx: #333;
$black_50: rgba(0, 0, 0, 0.5);
$white_50: rgba(255, 255, 255, 0.5);
$white_25: rgba(255, 255, 255, 0.25);

//@extend-elements
//original selectors
//.btn-secondary, .btn-secondary:hover, .btn-secondary:focus
%extend_1 {
  color: $color_mine_shaft_approx;
  //Instead of the line below you could use @include text-shadow($shadow-1, $shadow-2, $shadow-3, $shadow-4, $shadow-5, $shadow-6, $shadow-7, $shadow-8, $shadow-9, $shadow-10)
  text-shadow: none;
  background-color: $white;
  border: 0.05rem solid $white;
}

a {
  color: $white;
  &:focus {
    color: $white;
  }
  &:hover {
    color: $white;
  }
}
.btn-secondary {
  @extend %extend_1;
  &:hover {
    @extend %extend_1;
  }
  &:focus {
    @extend %extend_1;
  }
}
html {
  height: 100%;
  background-color: $color_mine_shaft_approx;
}
body {
  height: 100%;
  background-color: $color_mine_shaft_approx;
  color: $white;
  text-align: center;
  //Instead of the line below you could use @include text-shadow($shadow-1, $shadow-2, $shadow-3, $shadow-4, $shadow-5, $shadow-6, $shadow-7, $shadow-8, $shadow-9, $shadow-10)
  text-shadow: 0 0.05rem 0.1rem $black_50;
}
.site-wrapper {
  display: table;
  width: 100%;
  height: 100%;
  min-height: 100%;
  //Instead of the line below you could use @include box-shadow($shadow-1, $shadow-2, $shadow-3, $shadow-4, $shadow-5, $shadow-6, $shadow-7, $shadow-8, $shadow-9, $shadow-10)
  box-shadow: inset 0 0 5rem $black_50;
}
.site-wrapper-inner {
  display: table-cell;
  vertical-align: top;
}
.cover-container {
  margin-right: auto;
  margin-left: auto;
}
.inner {
  padding: 2rem;
}
.masthead {
  margin-bottom: 2rem;
}
.masthead-brand {
  margin-bottom: 0;
}
.nav-masthead {
  .nav-link {
    padding: 0.25rem 0;
    font-weight: bold;
    color: $white_50;
    background-color: transparent;
    border-bottom: 0.25rem solid transparent;
    &:hover {
      border-bottom-color: $white_25;
    }
    &:focus {
      border-bottom-color: $white_25;
    }
    + .nav-link {
      margin-left: 1rem;
    }
  }
  .active {
    color: $white;
    border-bottom-color: $white;
  }
}
@media (min-width: 48em) {
  .masthead-brand {
    float: left;
  }
  .nav-masthead {
    float: right;
  }
}
.cover {
  padding: 0 1.5rem;
  .btn-lg {
    padding: 0.75rem 1.25rem;
    font-weight: bold;
  }
}
.mastfoot {
  color: $white_50;
}
@media (min-width: 40em) {
  .masthead {
    position: fixed;
    top: 0;
    width: 100%;
  }
  .mastfoot {
    position: fixed;
    bottom: 0;
    width: 100%;
  }
  .site-wrapper-inner {
    vertical-align: middle;
  }
  .cover-container {
    width: 100%;
  }
}
@media (min-width: 62em) {
  .masthead {
    width: 42rem;
  }
  .mastfoot {
    width: 42rem;
  }
  .cover-container {
    width: 42rem;
  }
}
</style>
