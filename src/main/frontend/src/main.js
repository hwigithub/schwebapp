import Vue from 'vue';
import BootstrapVue from "bootstrap-vue";

import App from './App.vue';
import Navbar from "./components/Navbar.vue";
import Main from "./components/Main.vue";
import Footer from "./components/Footer.vue";

import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

Vue.use(BootstrapVue);

new Vue({
  el: "#app",
  render: h => h(App)
});

new Vue({
  el: "#app-navbar",
  render: h => h(Navbar)
});

new Vue({
  el: "#app-main",
  render: h => h(Main)
});

new Vue({
  el: "#app-footer",
  render: h => h(Footer)
});