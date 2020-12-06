import Vue from "vue";
import VueRouter from "vue-router";

import VueComponent1 from "../components/VueComponent1"

Vue.use(VueRouter)
export default new VueRouter({
  routes: [
    {
      path: '/vueComponent1',
      name: 'vueComponent1',
      component: VueComponent1
    }
  ]
})
