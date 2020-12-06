<template>
  <div id="app">
    <img src="./assets/logo.png">
    <h1>这个是首页</h1>
    <HelloWorld/>
    <VueComponent1/>
    <router-link to="/vueComponent1">点进展示组件</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
  import HelloWorld from './components/HelloWorld'
  import VueComponent1 from './components/VueComponent1'


  export default {
    name: 'App',
    components: {
      HelloWorld,
      VueComponent1
    }
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
