
export default {
  state: {
    user: "", // 登录的用户
    showLogin: false, // 用于控制是否显示登录组件
    routerAlive:true
  },
  getters: {
    getUser (state) {
      return state.user
    },
    getShowLogin (state) {
      return state.showLogin
    },
    getRouterAlive(state){
      return state.routerAlive;
    }
  },
  mutations: {
    setRouterAlive (state, data) {
      state.routerAlive = data;
    },
    setUser (state, data) {
      state.user = data;
    },
    setShowLogin (state, data) {
      state.showLogin = data;
    }
  },
  actions: {
    setUser ({ commit }, data) {
      commit('setUser', data);
    },
    setShowLogin ({ commit }, data) {
      commit('setShowLogin', data);
    },
    setRouterAlive ({ commit }, data) {
      commit('setRouterAlive', data);
    }
  }
}